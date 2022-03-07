package com.training.multithreading;

public class ThreadDemo1 extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+" ");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 t1=new ThreadDemo1();
		ThreadDemo1 t2=new ThreadDemo1();
		t1.setName("first");
		t2.setName("Second");
		t1.start();
		t2.start();
	}

}
