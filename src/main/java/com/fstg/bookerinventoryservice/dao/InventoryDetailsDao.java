package com.fstg.bookerinventoryservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.bookerinventoryservice.bean.InventoryDetails;
@Repository
public interface InventoryDetailsDao extends JpaRepository<InventoryDetails, Long> {

	
}