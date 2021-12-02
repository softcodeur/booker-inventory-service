package com.fstg.bookerinventoryservice.ws.provider;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.bookerinventoryservice.bean.Inventory;
import com.fstg.bookerinventoryservice.service.facade.InventoryService;
import com.fstg.bookerinventoryservice.ws.proxy.InventoryProxy;

@RestController
@RequestMapping(value = "/v1/api/inventory")
public class InventoryRest {
   
	@Autowired
	private InventoryService inventoryService; 
	   @Autowired
	    private InventoryProxy inventoryProxy;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(InventoryRest.class);


	
	@GetMapping("/")
	List<Inventory> findAll(){
		return inventoryService.findAll();
	}
	

	@GetMapping("/{id}")
	Inventory findById(@PathVariable("id") Long id) {
		return inventoryService.findById(id);
	}
	

     
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable("id") Long id) {
		inventoryService.deleteById(id);
	}


    @PostMapping("/")
	Inventory save(Inventory inventory) {
    	
		return inventoryService.save(inventory);
	}

    @PutMapping("/")
	Inventory update(@RequestBody Inventory inventory) {
		return inventoryService.save(inventory);
	}
    
	@DeleteMapping("/")
	int delete(@RequestBody Inventory inventory) {
    return inventoryService.delete(inventory);
	}


	@GetMapping("/sellerId/{sellerId}")
	public List<Inventory> getSellerInventories(@PathVariable("sellerId") Long sellerId) {
		Inventory critera = new Inventory();
		critera.setSellerId(sellerId);
		Example<Inventory> example = Example.of(critera);
		return inventoryService.findAll(example);
	}
	
	
	@PostMapping(value = "/sellerId/{sellerId}/ref/{ref}")
	public Inventory saveSellerInventory(@RequestBody Inventory inventory, 
			@PathVariable("sellerId")Long sellerId, @PathVariable("ref") Long ref) {

		if(!isValidProduct(ref)) {
			throw new RuntimeException("Product with ref ["+ref+"] not found");
		}
		
		if(!isValidSeller(sellerId)) {
			throw new RuntimeException("Seller with id ["+sellerId+"] is not a valid seller");
		}
		
		inventory.getInventoryDetails().setProductRef(ref);
		inventory.setSellerId(sellerId);
		return inventoryService.save(inventory);
	}
	



	private boolean isValidSeller(Long sellerId) {
		return	inventoryProxy.isSellerExist("sellerId");
	}

	private boolean isValidProduct(Long ref) {
		return inventoryProxy.isProductExist("productRef");
	}

}
