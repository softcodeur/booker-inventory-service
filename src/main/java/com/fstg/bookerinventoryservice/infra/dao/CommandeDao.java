package com.fstg.bookerinventoryservice.infra.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.bookerinventoryservice.infra.entity.CommandeEntity;


@Repository
public interface CommandeDao extends JpaRepository<CommandeEntity,Long> {
    CommandeEntity findByReference(String reference);
    int deleteByReference(String reference);
}
