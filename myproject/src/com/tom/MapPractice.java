package com.tom;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapPractice {

	public static void main(String[] args) {
		Random x = new Random();
		Map<Integer, Integer> m = new HashMap<>();
		for(int i=0; i<10000; i++) {
			int r = x.nextInt(20);
			Integer fq = m.get(r);
			if(fq == null) {
				m.put(r, 1);
			}
			else {
				m.put(r, fq+1);
			}
		}
		System.out.println(m);
	}

}
