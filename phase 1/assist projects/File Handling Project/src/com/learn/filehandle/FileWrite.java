package com.learn.filehandle;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data = "Name:Taara,Roll_no:15,Percent:95";

try {
	FileWriter output = new FileWriter("C:\\Users\\reshm\\Downloads\\Fileproject\\Data.txt");
	output.write(data);
	System.out.println("Data written successfully");
	output.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
System.out.println("File write error....");
	e.printStackTrace();
}

	}

}
