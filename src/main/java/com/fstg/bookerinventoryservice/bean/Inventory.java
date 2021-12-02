package com.fstg.bookerinventoryservice.bean;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Inventory {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long sellerId;
	/*@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateDebut;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateFin;*/
	private String description;
	@ManyToOne
	private InventoryStatus inventoryStatus;
	@OneToOne
	private InventoryDetails inventoryDetails;
	
}
