package com.fstg.bookerinventoryservice.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InventoryDetails {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long productRef;
	private int availableQuantity; 
	private int anticipateQuantity;
	
}
