package com.jsp.lambdaExperession;

public class ReversedOrder {

	public static void main(String[] args) {
		int arr[]= new int[] {2,4,6,7,8};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("reverse order");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();

	}

}
