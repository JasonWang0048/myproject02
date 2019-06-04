package com.tom;

public class TakeNotes implements Runnable{
	@Override
	public void run() {
		try {
			System.out.println("Taking notes");
			Thread.sleep(7000);
			System.out.println("Notes finished");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
