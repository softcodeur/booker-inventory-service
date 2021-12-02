
package com.fstg.bookerinventoryservice.ws.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "booker-product-service", url="localhost:8085")
public interface InventoryProxy {

    
	@GetMapping("product-api/sellers/ref/{ref}")
	public boolean isSellerExist(@PathVariable String ref);
	
	@GetMapping("product-api/products/ref/{ref}")
	public boolean isProductExist(@PathVariable String ref);
}
