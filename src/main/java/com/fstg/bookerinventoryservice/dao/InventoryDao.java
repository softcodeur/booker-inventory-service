package com.fstg.bookerinventoryservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.bookerinventoryservice.bean.Inventory;
@Repository
public interface InventoryDao extends JpaRepository<Inventory, Long> {

	
}
 