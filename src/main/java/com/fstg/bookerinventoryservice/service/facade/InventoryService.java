package com.fstg.bookerinventoryservice.service.facade;

import java.util.List;

import org.springframework.data.domain.Example;

import com.fstg.bookerinventoryservice.bean.Inventory;

public interface InventoryService {
	List<Inventory> findAll();
	   
	List<Inventory> findAll(Example<Inventory> example);

  
	Inventory findById(Long id);
	
	 

	Inventory findByCritera(Example<Inventory> example);

     
  
	void deleteById(Long id);


 
	Inventory save(Inventory inventory);

     
	Inventory update(Inventory inventory);
    
    
	int delete(Inventory inventory);


}
