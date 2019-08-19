package com.esh.stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushBackInputStreamTest {

	public static void main(String[] args) {
		String name = "exshita";
		try (PushbackInputStream pis = new PushbackInputStream(new ByteArrayInputStream(name.getBytes()));) {
			int ch;
			while ((ch = pis.read()) != -1) {
				if((char)ch == 'x'){
					pis.unread(ch);
				} 
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
