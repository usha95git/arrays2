package com.jsp.mutithreading;

public class Pythonthread implements Runnable{

	@Override
	public void run() {
		
		for (int i=0;i<10;i++) {
			System.out.println("python programming");
			try {
				Thread.sleep(200);
			}catch (InterruptedException e) {
			e.printStackTrace();	
				
			}
		}
		
	}

}
