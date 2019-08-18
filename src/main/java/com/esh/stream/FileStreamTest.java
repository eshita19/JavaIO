package com.esh.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
	public static void main(String[] args) throws IOException {
		File f = new File("/Users/emathur/Desktop", "a.txt");
		f.createNewFile();

		try (FileOutputStream fop = new FileOutputStream(f);) {
			String str = "Eshita Mathur";
			fop.write(str.getBytes());
		}

		try (FileInputStream fis = new FileInputStream(f);) {
			System.out.println("The number of bytes in file :  " + fis.available());
			byte[] strPart = new byte[6];
			fis.read(strPart);
			System.out.println("The first string is " + new String(strPart));
			System.out.println(fis.available());
			strPart = new byte[fis.available()];
			fis.read(strPart, strPart.length -1, fis.available() -1);
			System.out.println("The Second string is " + new String(strPart));
		}
	}
}
