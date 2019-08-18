package com.esh.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Buffered input stream with support of mark, reset and skip
public class BufferedInputStreamTest {
	public static void main(String[] args) {
		String  str = "Hello world";
		File file = new File("/Users/emathur/Documents/a.txt");
		try(BufferedOutputStream op = new BufferedOutputStream(new FileOutputStream(file));){
			op.write(str.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedInputStream ip = new BufferedInputStream(new FileInputStream(file))){
			int ch;
			ip.mark(ip.available());
			System.out.print((char)ip.read()); 
			ip.reset();//Read hello twice
			while((ch = ip.read())!=-1){
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
