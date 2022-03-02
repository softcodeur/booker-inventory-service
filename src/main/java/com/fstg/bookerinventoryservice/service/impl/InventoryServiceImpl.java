package com.fstg.bookerinventoryservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.fstg.bookerinventoryservice.bean.Inventory;
import com.fstg.bookerinventoryservice.bean.InventoryDetails;
import com.fstg.bookerinventoryservice.bean.InventoryStatus;
import com.fstg.bookerinventoryservice.dao.InventoryDao;
import com.fstg.bookerinventoryservice.service.facade.InventoryDetailsService;
import com.fstg.bookerinventoryservice.service.facade.InventoryService;
import com.fstg.bookerinventoryservice.service.facade.InventoryStatusService;
import com.fstg.bookerinventoryservice.ws.proxy.InventoryProxy;
@Service
public class InventoryServiceImpl  implements InventoryService{
	   @Autowired
     private InventoryDao inventoryDao;
	   @Autowired
	  private InventoryDetailsService inventoryDetailsService;
	   @Autowired
	     private InventoryStatusService inventoryStatusService;
	   
	   @Autowired
	    private InventoryProxy inventoryProxy;
	   
	@Override
	public List<Inventory> findAll() {
		return inventoryDao.findAll();
	}

	@Override
	public Inventory findById(Long id) {
		return inventoryDao.findById(id).get();
	}

	@Override
	public Inventory findByCritera(Example<Inventory> example) {
		return inventoryDao.findOne(example).get();
	}

	@Override
	public void deleteById(Long id) {
		inventoryDao.deleteById(id);
	}

	@Override
	public Inventory save(Inventory inventory) {
		InventoryDetails inventoryDetails = inventoryDetailsService.save(inventory.getInventoryDetails());
		inventory.setInventoryDetails(inventoryDetails);
		
		InventoryStatus inventoryStatus = inventoryStatusService.save(inventory.getInventoryStatus());
		inventory.setInventoryStatus(inventoryStatus);
		return inventoryDao.save(inventory);
	}

	@Override
	public Inventory update(Inventory inventory) {
		return  inventoryDao.save(inventory);
	}

	@Override
	public int delete(Inventory inventory) {
			inventoryDao.delete(inventory);
			return 1;
	}

	@Override
	public List<Inventory> findAll(Example<Inventory> example) {
		return inventoryDao.findAll(example);
	}

}
