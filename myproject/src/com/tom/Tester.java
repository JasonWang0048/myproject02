package com.tom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {

	public static void main(String[] args) {
		int n = Integer.parseInt("35");
/*		try {
		FileReader fr = new FileReader("aa.txt");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
*/
/*		File file = new File("aa.txt");
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.length());
		if(file.exists()) {
			System.out.println(file.getTotalSpace());
			System.out.println(file.getName() + "\t" + file.getAbsolutePath());
		}
*/		
/*		File dir = new File("C:\\SWSetup");
		if(dir.exists() && dir.isDirectory()) {
			String[] files = dir.list();
			for(String s: files) {
				System.out.println(s);
			}
		}
*/		
		File dir = new File("C:\\SWSetup");
		if(dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			for(File f: files) {
				if(f.isDirectory()) {
					System.out.println(f.getName());
				}
			}
			
			File db = new File(dir, "abc\\a\\bb");
//			System.out.println(db.mkdir());
			System.out.println(db.mkdirs());
			System.out.println(db.delete());
		}
	}

}
