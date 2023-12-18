package com.jsp.arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n=5;
		int fact=fact(n);
		System.out.println("factrioal number is:"+fact);
		

	}
	public static int fact(int n) {
		if(n==1) {
			return 1;
			
		}
		else {
		return (n*fact(n-1));
		
	}}
}
	
