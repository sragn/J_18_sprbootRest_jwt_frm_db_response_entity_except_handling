package com.thinkconstructive.restdemo.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	  @ExceptionHandler(ResourceNotFoundException.class)
	    public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException ex) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	    }	  
	  
//	  @ExceptionHandler(AgentAlreadyExistsException.class)
//	  public ResponseEntity<String> handleAgentAlreadyExists(AgentAlreadyExistsException ex){
//		  
//		  return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
//	  }
	  
	  @ExceptionHandler(Exception.class)
	    public ResponseEntity<?> handleGeneralException(Exception ex) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("error", "Something went wrong"));
	    }
	  
	  @ExceptionHandler(AgentAlreadyExistsException.class)
	    public ResponseEntity<Map<String, String>> AgentAlreadyExistsException(AgentAlreadyExistsException ex) {
	        Map<String, String> errorResponse = new HashMap<>();
	        errorResponse.put("error", ex.getMessage());
	        //return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	        return ResponseEntity
	                .status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body(errorResponse);
	    }

}
