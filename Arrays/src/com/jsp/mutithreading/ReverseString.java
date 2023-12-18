package com.jsp.mutithreading;

public class ReverseString {

	public static void main(String[] args) {
		String sb = new String("welcome");
		String[] s1 = sb.split("");
		for(int i=sb.length()-1;i>=0;i--) {
			
			System.out.println(s1[i]);
			
		}

	}

}
