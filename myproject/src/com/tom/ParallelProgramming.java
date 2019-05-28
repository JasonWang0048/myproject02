package com.tom;

public class ParallelProgramming {

	public static void main(String[] args) {
//		方法一
/*		Horse h = new Horse();
		h.start();
		for(int i=1; i <= 10000; i++) {
			System.out.println("Horse1 " + i);
		}
		System.out.println("main end");
*/		
//		方法二
/*		HorseRunnable h1 = new HorseRunnable();
		Thread thread = new Thread(h1);
		thread.start();
		System.out.println("main end");
*/
//		方法三(改寫Horse, 新增建構子)
		Horse h1 = new Horse("H1:");
		h1.start();
		Horse h2 = new Horse("H2:");
		h2.start();
		System.out.println("main end");
	}

}
