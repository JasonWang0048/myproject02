package com.quiz;

public class Ticket {
	protected int num;
	private String type;
	
	public Ticket(int num, String type) {
		this.num = num;
		this.type = type;
	}
	
	public void show(){
		System.out.print("number" + num + "\t" + type);
	}
}
