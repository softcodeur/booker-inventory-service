package com.fstg.bookerinventoryservice.domain.commande.paiement;

import com.fstg.bookerinventoryservice.domain.core.AbstractProcessInput;

public class CommandePaiementInput extends AbstractProcessInput {
    String reference;
    double montant;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
