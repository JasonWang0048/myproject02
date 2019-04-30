package com.tom;

public class ScoreRangeException extends Exception {

	@Override
	public String getMessage() {
		return "Enter value out of range(the number must be >0 & <100)";
	}
	
}
