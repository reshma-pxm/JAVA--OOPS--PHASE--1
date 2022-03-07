package com.learn.filehandle;


import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] data = new char[100];

try {
	FileReader input = new FileReader("C:\\Users\\reshm\\Downloads\\Fileproject\\Data.txt");
	input.read(data);
	System.out.println("Data read successfully");
	System.out.println(data);
	input.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	System.out.println("File read error....");
	e.printStackTrace();
}

	}

}
