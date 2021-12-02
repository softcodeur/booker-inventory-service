package com.fstg.bookerinventoryservice.application.util;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fstg.bookerinventoryservice.domain.commande.delete.CommandeDeleteProcess;
import com.fstg.bookerinventoryservice.domain.commande.delete.CommandeDeleteProcessImpl;
import com.fstg.bookerinventoryservice.domain.commande.paiement.CommandePaiementProcess;
import com.fstg.bookerinventoryservice.domain.commande.paiement.CommandePaiementProcessImpl;
import com.fstg.bookerinventoryservice.infra.facade.CommandeInfra;

@Configuration
public class Processinjection {

    @Bean
    public  CommandePaiementProcess commandePaiementProcess(CommandeInfra commandeInfra){
        return new CommandePaiementProcessImpl(commandeInfra);
    }
    @Bean
    public CommandeDeleteProcess commandeDeleteProcess(CommandeInfra commandeInfra){
        return new CommandeDeleteProcessImpl(commandeInfra);
    }
}

