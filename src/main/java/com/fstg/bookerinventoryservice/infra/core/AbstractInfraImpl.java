package com.fstg.bookerinventoryservice.infra.core;

import org.springframework.beans.factory.annotation.Autowired;

import com.fstg.bookerinventoryservice.infra.core.messaging.LocalMessageReader;


public class AbstractInfraImpl implements AbstractInfra {

	
	  @Autowired
	    private LocalMessageReader localMessageReader;

	@Override
	public String getMessage(String code) {
		  String message= localMessageReader.getMessage(code);
	        return message;
	}
		
	
	

	   
	

}
