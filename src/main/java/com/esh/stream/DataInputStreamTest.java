package com.esh.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		File file = new File("/users/emathur/Documents/a.txt");
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));){
			dos.writeBoolean(true);
			dos.writeDouble(12324234324234324f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(file));){
			System.out.println(dis.readBoolean() + " " + dis.readDouble());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
