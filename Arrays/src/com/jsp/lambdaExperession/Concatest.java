package com.jsp.lambdaExperession;

public class Concatest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer st = new StringBuffer("java");
		for (int i=0;i<1;i++) {
			st.append("python");
			
		}
		System.out.println("time taken by string buffer"+(System.currentTimeMillis()-startTime)+ "ms");
		StringBuilder sb = new StringBuilder("java");
		for (int i=0;i<1;i++) {
			sb.append("python");
			
		}
		System.out.println("time taken by string builder"+(System.currentTimeMillis()-startTime)+ "ms");
		


	}

}
