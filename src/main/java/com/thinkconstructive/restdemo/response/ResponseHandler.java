package com.thinkconstructive.restdemo.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

	public static ResponseEntity<Object> responseBuilder (String message,HttpStatus httpStatus, Object responseObj,String type)
	{
		Map<String, Object> response =new HashMap<>();
		
		response.put("error_code", message);
		response.put("httpStatus", httpStatus);
		response.put("data", responseObj);
		response.put("type", type);
		
		return new ResponseEntity<>(response,httpStatus);
	}
}
