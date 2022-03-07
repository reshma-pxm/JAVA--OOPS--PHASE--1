package com.learning.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LoggingToFile {
	private static void writeToFile(Exception ex) throws IOException {
	      //Retrieving the log file
	      Path logFile = Paths.get("ExceptionLog.txt");
	      //Preparing the data to be logged
	      byte bytes[] = ("\r\n"+LocalDateTime.now()+": "+ ex.toString()).getBytes();
	      //Appending the exception to your file
	      Files.write(logFile, bytes, StandardOpenOption.APPEND);
	      System.out.println("Exception logged to your file");
	   }
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      int[] arr = {10, 20, 30, 2, 0, 8};
	      System.out.println("Array: "+Arrays.toString(arr));
	      System.out.println("Choose numerator and denominator (not 0) from this array (enter positions 0 to 5)");
	      try {
	         int a = sc.nextInt();
	         int b = sc.nextInt();
	         int result = (arr[a])/(arr[b]);
	         System.out.println("Result of "+arr[a]+"/"+arr[b]+": "+result);
	      }catch(ArrayIndexOutOfBoundsException ex) {
	         System.out.println("Warning: You have chosen a position which is not in the array");
	         writeToFile(ex);
	      }catch(ArithmeticException ex) {
	         System.out.println("Warning: You cannot divide an number with 0");
	         writeToFile(ex);
	      }catch(InputMismatchException ex) {
	         System.out.println("Warning: You have entered invalid input");
	         writeToFile(ex);
	      }
	   }
	}
	
	


