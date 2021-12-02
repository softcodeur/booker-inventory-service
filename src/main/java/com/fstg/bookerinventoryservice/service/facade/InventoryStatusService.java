package com.fstg.bookerinventoryservice.service.facade;

import java.util.List;

import org.springframework.data.domain.Example;

import com.fstg.bookerinventoryservice.bean.InventoryStatus;

public interface InventoryStatusService {
	List<InventoryStatus> findAll();
	   
	List<InventoryStatus> findAll(Example<InventoryStatus> example);

  
	InventoryStatus findById(Long id);
	
	 

	InventoryStatus findByCritera(Example<InventoryStatus> example);

     
  
	void deleteById(Long id);


 
	InventoryStatus save(InventoryStatus inventoryStatus);

     
	InventoryStatus update(InventoryStatus inventoryStatus);
    
    
	int delete(InventoryStatus inventoryStatus);


}
