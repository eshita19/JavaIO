package com.esh.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStreamTest {

	public static void main(String[] args) {
		File file = new File("/Users/emathur/Documents/a.txt");
		try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file));){
			Student student = new Student();
			student.setName("Eshita");
			writer.writeObject(student);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));){
			Student student = (Student)reader.readObject();
			System.out.println(student.getName());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}

class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
