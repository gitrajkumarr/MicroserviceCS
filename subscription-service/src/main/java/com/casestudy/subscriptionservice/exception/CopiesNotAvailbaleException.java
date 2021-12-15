package com.casestudy.subscriptionservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;


public class CopiesNotAvailbaleException extends Exception {
	
	private static final long serialVersionUID = 3929244084953848048L;	
	
	public CopiesNotAvailbaleException(String message) {
	      super(message);
	      throw new ResponseStatusException(
		           HttpStatus.UNPROCESSABLE_ENTITY, "available copies are '0' so cant subscribe");
	 }
}
