package com.fstg.bookerinventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.fstg.bookerinventoryservice.ws.provider")
public class BookerInventoryServiceApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BookerInventoryServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
          System.out.println("Project Work Perfectly !");		
	}

}
