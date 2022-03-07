package com.learn.access;

public class AccessModifiers {
	public void publicmethod() {
		System.out.println("This is a public method");
	}
	private void privatemethod() {
		
		System.out.println("This is a private method");
	}
    protected void protectedmethod() {
		
		System.out.println("This is a protected method");
	}
    void defaultmethod() {
    	System.out.println("This is a default method");
	}
    
	public static void main(String[] args) {
		// same class able to access all the methods
AccessModifiers obj=new AccessModifiers();
obj.publicmethod();
obj.privatemethod();
obj.protectedmethod();
obj.defaultmethod();
	}

}
