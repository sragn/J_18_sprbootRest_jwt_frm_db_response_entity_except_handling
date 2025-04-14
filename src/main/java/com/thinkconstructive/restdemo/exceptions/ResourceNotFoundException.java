package com.thinkconstructive.restdemo.exceptions;

public class ResourceNotFoundException extends RuntimeException  {

	public ResourceNotFoundException(String message) {
        super(message);
    }
	
}
