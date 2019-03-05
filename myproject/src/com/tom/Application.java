package com.tom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		List<String> supermarket = new ArrayList<String>();
		supermarket.add("您好, 歡迎光臨!");
		supermarket.add("零食區特價八折優惠中");
		supermarket.add("悠遊卡結帳打九折");
		supermarket.add("掰掰, 謝謝惠顧!");
		supermarket.add("您好, 歡迎光臨!");
		System.out.println(supermarket);
		
		Set<String> lottery = new HashSet<>();
		lottery.add("4號");
		lottery.add("7號");
		lottery.add("1號");
		lottery.add("4號");
		lottery.add("9號");
		System.out.println(lottery);
	}

}
