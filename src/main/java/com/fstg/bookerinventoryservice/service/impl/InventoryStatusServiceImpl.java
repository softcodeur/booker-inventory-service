package com.fstg.bookerinventoryservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.fstg.bookerinventoryservice.bean.InventoryStatus;
import com.fstg.bookerinventoryservice.dao.InventoryStatusDao;
import com.fstg.bookerinventoryservice.service.facade.InventoryStatusService;
@Service
public class InventoryStatusServiceImpl  implements InventoryStatusService{
	   @Autowired
     private InventoryStatusDao inventoryStatusDao;
	@Override
	public List<InventoryStatus> findAll() {
		return inventoryStatusDao.findAll();
	}

	@Override
	public InventoryStatus findById(Long id) {
		return inventoryStatusDao.findById(id).get();
	}

	@Override
	public InventoryStatus findByCritera(Example<InventoryStatus> example) {
		return inventoryStatusDao.findOne(example).get();
	}

	@Override
	public void deleteById(Long id) {
		inventoryStatusDao.deleteById(id);
	}

	@Override
	public InventoryStatus save(InventoryStatus inventoryStatus) {
		return inventoryStatusDao.save(inventoryStatus);
	}

	@Override
	public InventoryStatus update(InventoryStatus inventoryStatus) {
		return  inventoryStatusDao.save(inventoryStatus);
	}

	@Override
	public int delete(InventoryStatus inventoryStatus) {
		inventoryStatusDao.delete(inventoryStatus);
			return 1;
	}

	@Override
	public List<InventoryStatus> findAll(Example<InventoryStatus> example) {
		return inventoryStatusDao.findAll(example);
	}

}
