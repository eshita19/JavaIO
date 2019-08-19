package com.esh.stream;

import java.io.ByteArrayInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamtest {

	public static void main(String[] args) {
		String str1 = "Eshita";
		String str2 = "Mathur";
		ByteArrayInputStream bis1 = new ByteArrayInputStream(str1.getBytes());
		ByteArrayInputStream bis2 = new ByteArrayInputStream(str2.getBytes());
		try (SequenceInputStream sis = new SequenceInputStream(bis1, bis2);) {
			int ch;
			while ((ch = sis.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
