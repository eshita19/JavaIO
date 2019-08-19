package com.esh.stream;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console c = System.console();
		System.out.print("Enter name: ");
		String name = c.readLine();
		System.out.println(name);
	}
}
