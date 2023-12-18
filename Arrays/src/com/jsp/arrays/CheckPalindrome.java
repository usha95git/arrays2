package com.jsp.arrays;

public class CheckPalindrome {
	public static void main(String[] args) {
	String str ="abba";
	String rev = "";

	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
		if(str.equals(rev)) {
		System.out.println("its a palindrome");
		}

	
	else {
		System.out.println("its not a palindrome");
	

		
	}}

}
