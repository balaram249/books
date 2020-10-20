package com.example.springboot.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BookDoesNotExistException extends Exception {

	public BookDoesNotExistException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookDoesNotExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
