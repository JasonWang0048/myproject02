package com.tom;

public class ScoreFormatException extends Exception {

	@Override
	public String getMessage() {
		return "Enter format invalid, connot convert to int";
	}
	
}
