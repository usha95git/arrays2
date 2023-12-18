package com.jsp.lambdaExperession;

public class LeftRotate {

	public static void main(String[] args) {
		int arr[]= new int[] {2,3,4,6,7,4};
		int n=5;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		for(int i=0;i<n;i++) {
			int j = 0  ,first;
			first=arr[0];
		for(int i1=0;i1<arr.length-1;i1++) {
				arr[j]=arr[i1+1];
				
			}
			arr[i]=first;
		}
		System.out.println();
		System.out.println("rotatae array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"");
			
		}
		System.out.println();
		

	}

}
