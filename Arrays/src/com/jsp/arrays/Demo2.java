package com.jsp.arrays;

public class Demo2 {

	public static void main(String[] args) {
		int[] a1 = {2,8,9};
		int[] a2 = {4,5,6,7,9,2};
		m1(a1);
		m1(a2);

	}
	static void m1(int[]a) {
		for(int n:a) {
			System.out.println(n+"");
		}
		System.out.println();
	}

}
