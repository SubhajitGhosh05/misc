package com.ibm.rest.webServices.restfulwebServices.User;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundExcption extends RuntimeException {

	public UserNotFoundExcption(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
