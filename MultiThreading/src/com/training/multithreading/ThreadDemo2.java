package com.training.multithreading;

public class ThreadDemo2 implements Runnable {
	 public void run()
	    {
	        for(int i=1;i<=5;i++)
	        {
	            System.out.println(i+ " "+Thread.currentThread().getName());
	            
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadDemo2 ins1=new ThreadDemo2();
ThreadDemo2 ins2=new ThreadDemo2();
//creating 2 threads by passing two runnable interfaces
Thread t1=new Thread(ins1);
Thread t2=new Thread(ins2);
t1.setName("thread 1");
t2.setName("thread 2");
t1.start();
t2.start();

	}

}
