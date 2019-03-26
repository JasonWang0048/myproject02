package com.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		System.out.println("輸入1新增項目");
		System.out.println("輸入2印出清單");
		System.out.println("輸入0完成清單");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while(x != 0) {
		List<String> list = new ArrayList<>();
		if(x == 1) {
			System.out.print("請輸入新增項目與數量: (項目/數量)");
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
