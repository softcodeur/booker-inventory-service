package com.fstg.bookerinventoryservice.domain.commande.paiement;

import com.fstg.bookerinventoryservice.domain.core.AbstractProcessImpl;
import com.fstg.bookerinventoryservice.domain.core.Result;
import com.fstg.bookerinventoryservice.domain.pojo.Commande;
import com.fstg.bookerinventoryservice.infra.facade.CommandeInfra;

public class CommandePaiementProcessImpl extends AbstractProcessImpl<CommandePaiementInput> implements CommandePaiementProcess {

    private CommandeInfra commandeInfra;


    public void validate(CommandePaiementInput commandePaiementInput, Result result) {
        String reference = commandePaiementInput.getReference();
        double montant = commandePaiementInput.getMontant();
        Commande commande = commandeInfra.findByReference(reference);
        if (commande == null || commande.getId() == null) {
            result.addErrorMessage(commandeInfra.getMessage("commande.paiment.not_founded"));
        } else if (commande.getTotalPaye() + montant > commande.getTotal()) {
            result.addErrorMessage(commandeInfra.getMessage("commande.paiment.prob_paiment"));
        }
    }


    public void run(CommandePaiementInput commandePaiementInput, Result result) {
        String reference = commandePaiementInput.getReference();
        double montant = commandePaiementInput.getMontant();
        Commande commande = commandeInfra.findByReference(reference);
        double nvTotalPaye = commande.getTotalPaye() + montant;
        commande.setTotalPaye(nvTotalPaye);
        commandeInfra.update(commande);
        result.addInfoMessage(commandeInfra.getMessage("commande.paiment.created"));
    }


    public CommandePaiementProcessImpl(CommandeInfra commandeInfra) {
        this.commandeInfra = commandeInfra;
    }
}
