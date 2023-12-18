package com.jsp.arrays;

public class Smallest {

	public static void main(String[] args) {
		int []a= {3,6,1,7,9,6};
		int small = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<small) small=a[i];
			System.out.println("small:"+small);
			
		}

	}

}
