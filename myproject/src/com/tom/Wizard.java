package com.tom;

public class Wizard extends Thread{

/*在不能改變main方法內程式碼的情況下, 使之印出以下結果:
 THUNDER START!
 THUNDER END!
 THUNDER START!
 THUNDER END!
 */
	
	public void thunder() {
//	  synchronized (this) {
		System.out.println("THUNDER START!");
		try {
			sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("THUNDER END!");
//	  }
	}
	
	
	@Override
	public void run() {
		thunder();
	}
	
	
	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		w1.start();
		Wizard w2 = new Wizard();
		w2.start();
	}

}
