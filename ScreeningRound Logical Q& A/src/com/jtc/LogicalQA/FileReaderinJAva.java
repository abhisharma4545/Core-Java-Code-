package com.jtc.LogicalQA;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderinJAva {
	public static void main(String[] args) {
		
	
	try {
	FileReader reader = new  FileReader("ar.txt");
	int data = reader.read();
	while (data != -1) {
		System.out.print((char)data);
		data = reader.read();
	}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}

}
