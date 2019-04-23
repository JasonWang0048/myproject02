package com.tom;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int average = 0;
		Scanner scan = new Scanner(System.in);
		try {
		System.out.print("Please enter the Math grade:");
		int math = Integer.parseInt(scan.nextLine());
		System.out.print("Please enter the English grade:");
		int english = Integer.parseInt(scan.nextLine());
		if (math < 0 || english < 0) {
			System.out.print("Grades cannot be Negative!");
		}
		else if (math > 100 || english > 100) {
			System.out.print("Grades cannot be over 100!");
		}
		else {
			average = (math + english) / 2;
			System.out.println(average);
		}
		} catch (ArithmeticException e) {
			System.out.println("數值運算錯誤");
		} catch(NumberFormatException e) {
			System.out.println("訊息格式錯誤");
		}
	}

}
