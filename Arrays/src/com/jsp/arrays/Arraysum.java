package com.jsp.arrays;

public class Arraysum {

	public static void main(String[] args) {
		int [] a = {3,4,5,8,9,2};
		String s ="";
		int sum =0;
		for(int i=0;i<a.length;i++) {
				sum+=a[i];
			s=s+"="+sum;
		System.out.println(s);
			
		}
		
		

}}
