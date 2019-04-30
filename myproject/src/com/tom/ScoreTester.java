package com.tom;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		int average;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Please enter the Math score:");
			Score math = new Score(scan.nextLine());
			System.out.print("Please enter the English score:");
			Score english = new Score(scan.nextLine());
			average = (math.value + english.value) / 2;
			System.out.println(average);
		} catch(ScoreFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
