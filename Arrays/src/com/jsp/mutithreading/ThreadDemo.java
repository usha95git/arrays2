package com.jsp.mutithreading;

public class ThreadDemo {

	public static void main(String[] args)throws InterruptedException {
		
		System.out.println("main thread->"+ Thread.currentThread().getName());
		Runnable runnable1 = new Javathread();
		Thread thread = new Thread( runnable1);
		thread.start();
		Runnable runnable2 = new Pythonthread();
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		Runnable runnable3 = new Cthread();
		Thread thread3 = new Thread(runnable3);
		thread3.start();
		
		
		
	}

}
