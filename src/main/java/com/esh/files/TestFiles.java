package com.esh.files;

import java.io.File;
import java.io.IOException;

public class TestFiles {

	public static void main(String[] args) throws IOException {
		File file = new File("/users/emathur/Desktop" ,"a.txt");
		file.createNewFile();
		System.out.println(file.exists());
		System.out.println("Abs path: " + file.getAbsolutePath());
		System.out.println("Write Permission: " + file.canExecute());
		System.out.println("Is file deleted : " + file.delete() + "\n");
		
		file = new File("/users/emathur/Desktop/myFolder");
		System.out.println("Is directrory : " + file.isDirectory());
		System.out.println("Is directory created : " + file.mkdir());
		System.out.println("Parent File : " + file.getParentFile());
		
	}
}
