package com.learn.filehandle;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File myFile = new File("C:\\Users\\reshm\\Downloads\\Fileproject\\Data.txt");

try {
	if(myFile.createNewFile()) {
		System.out.println("File created successfully");
	}

} catch (IOException e) {
	// TODO Auto-generated catch block
System.out.println("File error....");
	e.printStackTrace();
}
	}

}
