package com.fstg.bookerinventoryservice.infra.facade;

import java.util.List;

import com.fstg.bookerinventoryservice.domain.pojo.Commande;
import com.fstg.bookerinventoryservice.infra.core.AbstractInfra;
import com.fstg.bookerinventoryservice.infra.entity.CommandeEntity;

public interface CommandeInfra extends AbstractInfra {
    Commande findByReference(String reference);

    int deleteByReference(String reference);

    int save(CommandeEntity commandeEntity);

    int update(CommandeEntity commandeEntity);

    List<CommandeEntity> findAll();

    int update(Commande commande);

}
