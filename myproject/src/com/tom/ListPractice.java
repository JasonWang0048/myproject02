package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListPractice {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<20; i++) {
			list.add(0);						
		}
		for(int i=0; i<10000; i++) {
			int r = random.nextInt(20);
			Integer fq = list.get(r);
			list.set(r, fq + 1);
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
	}

}
