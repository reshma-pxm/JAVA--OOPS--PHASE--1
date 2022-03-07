package com.learn.filehandle;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data = "\nCongratulations! passed with Distinction";
try {
	FileWriter output = new FileWriter("C:\\Users\\reshm\\Downloads\\Fileproject\\Data.txt",true);
	output.write(data);
	System.out.println("Data appended successfully");
	output.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
System.out.println("File append error.....");	
	e.printStackTrace();
}
	}

}
