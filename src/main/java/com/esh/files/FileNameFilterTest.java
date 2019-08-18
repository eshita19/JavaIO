package com.esh.files;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

class ZIPFileNameFilter implements FilenameFilter{
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".zip");
	}
}
public class FileNameFilterTest {
	public static void main(String[] args) {
		File f = new File("/Users/emathur/Desktop");
		System.out.println("All Files in DEsktop folder: ");
		Arrays.stream(f.list()).forEach(elem -> System.out.print(elem + ", "));
		System.out.println("\nZIP Files in DEsktop folder: ");
		Arrays.stream(f.list(new ZIPFileNameFilter())).forEach(elem -> System.out.print(elem + ", "));
	}
}
