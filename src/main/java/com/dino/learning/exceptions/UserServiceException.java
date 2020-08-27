package com.dino.learning.exceptions;

public class UserServiceException extends RuntimeException {

	private static final long serialVersionUID = -8613583411519173399L;

	public UserServiceException(String message) {
		super(message);
	}
}
