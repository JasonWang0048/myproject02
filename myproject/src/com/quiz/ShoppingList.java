package com.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		System.out.println("��J1�s�W����");
		System.out.println("��J2�L�X�M��");
		System.out.println("��J0�����M��");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while(x != 0) {
		List<String> list = new ArrayList<>();
		if(x == 1) {
			System.out.print("�п�J�s�W���ػP�ƶq: (����/�ƶq)");
			String s = scan.nextLine();
			if(s.equals("0")) {
				break;
			}
			list.add(s);
		}
		else if(x == 2) {
			System.out.println(list);
		}
		else {
			break;
		}
		}
	}

}
