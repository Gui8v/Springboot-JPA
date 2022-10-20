package com.example.SpringbootJPA.services.exceptions;

public class ResoucerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResoucerNotFoundException(Object id) {
		super("Resource not found. Id: " + id);
	}
}
