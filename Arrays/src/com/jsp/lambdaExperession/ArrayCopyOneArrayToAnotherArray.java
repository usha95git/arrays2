package com.jsp.lambdaExperession;

public class ArrayCopyOneArrayToAnotherArray {

	public static void main(String[] args) {
		int arr1[]= new int[] {1,3,4,6,7,8,23};
		int arr2[]= new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
			
		}
		System.out.println("first aaray elements");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"");
		}
		System.out.println();
		System.out.println("new array");
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+"");
		}
		System.out.println();
		

	}

}
