package com.fstg.bookerinventoryservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.fstg.bookerinventoryservice.bean.InventoryDetails;
import com.fstg.bookerinventoryservice.dao.InventoryDetailsDao;
import com.fstg.bookerinventoryservice.service.facade.InventoryDetailsService;
@Service
public class InventoryDetailsServiceImpl  implements InventoryDetailsService{
	   @Autowired
     private InventoryDetailsDao inventoryDetailsDao;
	@Override
	public List<InventoryDetails> findAll() {
		return inventoryDetailsDao.findAll();
	}

	@Override
	public InventoryDetails findById(Long id) {
		return inventoryDetailsDao.findById(id).get();
	}

	@Override
	public InventoryDetails findByCritera(Example<InventoryDetails> example) {
		return inventoryDetailsDao.findOne(example).get();
	}

	@Override
	public void deleteById(Long id) {
		inventoryDetailsDao.deleteById(id);
	}

	@Override
	public InventoryDetails save(InventoryDetails inventoryDetails) {
		return inventoryDetailsDao.save(inventoryDetails);
	}

	@Override
	public InventoryDetails update(InventoryDetails inventoryDetails) {
		return  inventoryDetailsDao.save(inventoryDetails);
	}

	@Override
	public int delete(InventoryDetails inventoryDetails) {
		inventoryDetailsDao.delete(inventoryDetails);
			return 1;
	}

	@Override
	public List<InventoryDetails> findAll(Example<InventoryDetails> example) {
		return inventoryDetailsDao.findAll(example);
	}

}
