package com.fstg.bookerinventoryservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.bookerinventoryservice.bean.InventoryStatus;
@Repository
public interface InventoryStatusDao extends JpaRepository<InventoryStatus, Long> {

	
}