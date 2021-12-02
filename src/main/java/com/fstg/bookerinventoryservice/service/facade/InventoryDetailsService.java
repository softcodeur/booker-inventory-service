package com.fstg.bookerinventoryservice.service.facade;

import java.util.List;

import org.springframework.data.domain.Example;

import com.fstg.bookerinventoryservice.bean.InventoryDetails;

public interface InventoryDetailsService {
	List<InventoryDetails> findAll();
	   
	List<InventoryDetails> findAll(Example<InventoryDetails> example);

  
	InventoryDetails findById(Long id);
	
	 

	InventoryDetails findByCritera(Example<InventoryDetails> example);

     
  
	void deleteById(Long id);


 
	InventoryDetails save(InventoryDetails inventoryDetails);

     
	InventoryDetails update(InventoryDetails inventoryDetails);
    
    
	int delete(InventoryDetails inventoryDetails);


}
