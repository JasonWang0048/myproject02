package com.tom;
import java.io.*;

public class BufferedTester {

	 public static String read(String filename) throws IOException {
		 	 // Reading input by lines:
			 BufferedReader in = new BufferedReader(new FileReader("data.txt"));
			 String s;
			 StringBuilder sb = new StringBuilder();
			 while((s = in.readLine())!= null)
			 sb.append(s + "\n");
			 in.close();
			 return sb.toString();
		 }
	 
		 public static void main(String[] args) throws IOException {
			 System.out.print(read("BufferedInputFile.java"));
		 }		 
	}


