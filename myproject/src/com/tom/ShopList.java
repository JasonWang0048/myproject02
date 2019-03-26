package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopList {

	public static void main(String[] args) {
		List<Item> objects = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String name = "";
		while (!name.equals("q")) {
			System.out.print("Please enter item name:");
			name = scan.nextLine();
			if(name.equals("q")) {
				break;
			}
			System.out.print("Please enter quantity:");
			int quantity = Integer.parseInt(scan.nextLine());
			objects.add(new Item(name, quantity));
			for(Item item : objects) {
				System.out.println(item.name + "\t" + item.quantity);
			}
		}

	}

}
