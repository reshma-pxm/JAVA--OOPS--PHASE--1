package com.learn.access;
public class AnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccessModifiers obj = new AccessModifiers();
obj.publicmethod();
//obj.privatemethod();cannot access private (another class same package)
obj.protectedmethod();
obj.defaultmethod();
	}

}
