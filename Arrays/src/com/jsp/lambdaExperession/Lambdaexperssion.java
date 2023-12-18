package com.jsp.lambdaExperession;
	

 interface shape {
	static void draw() {
		// TODO Auto-generated method stub
		
	}
}



 class Angle implements shape{

	public void draw() {
		System.out.println("rectangular draw method");
		
	}
	public class Circle implements shape{

		public void draw() {
			System.out.println("circle draw method");
		}
		public class Square implements shape{

			public void draw() {
				System.out.println("square draw method");
				
			}
			
		}
		
	}


}


public class Lambdaexperssion {
	public static void main(String[] args) {
		
		String str = "hello";
		System.out.println(str);
		shape.draw();
		
	

	}}
