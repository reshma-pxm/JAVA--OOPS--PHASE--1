package com.learn.email;

import java.util.*;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in); 
         System.out.print("Enter the Email ID: ");  
         String email = sc.nextLine();  
         sc.close();
         ArrayList<String> al=new ArrayList<String>();   
	      al.add("reshma345@gmail.com");
	      al.add("thaara456@gmail.com");
	      al.add("pravalli987@gmail.com");
	      al.add("krithik900@gmail.com");
	      al.add("aneesh098@gmail.com");
	      if (al.contains(email)){
	    	System.out.println("EMAIL WAS AVAILABLE");
	       }
	      else {
	    		System.out.println("EMAIL WAS UNAVAILABLE");
	       }
	}

}
