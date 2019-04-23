package com.tom;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		int bonus = 10000000;
		int div = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("How many people won the price:");
		String people = scan.nextLine();
		try {
		int n = Integer.parseInt(people);
		div = bonus/n;
		if (n < 0) {
			System.out.println("人數不可為負值");
		} else {
			System.out.println("$" + div + " " + "for each person!");
		}
		} 
//		catch(Exception e) {
//			System.out.println("輸入資料錯誤!");
//		}
		  catch(ArithmeticException e) {
			System.out.println("數值運算錯誤");
		} catch(NumberFormatException e) {
			System.out.println("輸入格式錯誤");
		}
	}

}
