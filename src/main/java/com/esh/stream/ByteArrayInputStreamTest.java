package com.esh.stream;

import java.io.ByteArrayInputStream;

// Buffered input stream for Byte array
public class ByteArrayInputStreamTest {
	public static void main(String[] args) {
		String tmp = "Eshita";
		byte b[] = tmp.getBytes();
		byte[] outputByteArray = new byte[b.length];

		ByteArrayInputStream input1 = new ByteArrayInputStream(b);
		input1.read(outputByteArray, 0, b.length);
		System.out.println(new String(outputByteArray));

		// mark, reset and skip
		try (ByteArrayInputStream input3 = new ByteArrayInputStream(outputByteArray);) {
			input3.skip(1); // Skip the first byte from input.
			int c, count = 1 ;
			while ((c = input3.read()) != -1) {
				System.out.print((char)c);
				if((char)c == 's' && count == 1){
					input3.mark(input3.available()); // mark the pointer after 's' is read
				}
				if((char) c == 't' && count == 1){
					input3.reset();
					count--;
				}
			} //output : shithita
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
