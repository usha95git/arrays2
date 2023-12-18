package com.jsp.lambdaExperession;

public class Largestarray {

	public static void main(String[] args) {
		int arr[]= new int[] {2,4,5,3,7};
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
			
		}
		System.out.println("array smallest number:"+ min);

	}

}
