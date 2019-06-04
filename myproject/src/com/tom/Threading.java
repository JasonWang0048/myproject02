package com.tom;

public class Threading {

	public static void main(String[] args) {
		Breakfast breakfast = new Breakfast();
		breakfast.start();
		
		TakeNotes tn = new TakeNotes();
		Thread thread = new Thread(tn);
		thread.start();
		
		try {
			breakfast.join();
			thread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ready to go");
	}

}
