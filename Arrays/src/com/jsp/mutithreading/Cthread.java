package com.jsp.mutithreading;

public class Cthread implements Runnable {

	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("c programming");
		
		try {
			Thread.sleep(200);
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
	}
	
	}

}
