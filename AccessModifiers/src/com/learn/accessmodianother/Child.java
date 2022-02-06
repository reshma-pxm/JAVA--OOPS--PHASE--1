package com.learn.accessmodianother;

import com.learn.access.AccessModifiers;//created child class of AccessModifiers in diff package

public class Child extends AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ch =new Child();
ch.publicmethod();
ch.protectedmethod();
//ch.privatemethod();cannot access
//ch.defaultmethod();cannot access
	}

}
