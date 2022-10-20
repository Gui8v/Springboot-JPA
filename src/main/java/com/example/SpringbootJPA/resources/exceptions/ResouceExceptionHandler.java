package com.example.SpringbootJPA.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.SpringbootJPA.services.exceptions.ResoucerNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResouceExceptionHandler {
	
	@ExceptionHandler(ResoucerNotFoundException.class)
	public ResponseEntity<StandardError> resouceNotFound(ResoucerNotFoundException e, HttpServletRequest request){
		String error = "Resoucer not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}
}
