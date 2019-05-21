package com.tom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Tester {

	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("data.txt");
		Reader in = new InputStreamReader(fis);
		int n = 0;
		while(n != -1) {
			n = in.read();
			System.out.print((char)n);
		}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
