package com.jsp.lambdaExperession;

public class DuplicateElements {

	public static void main(String[] args) {
		int arr[]= new int[]{1,3,5,6,4,1,4,3,3,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				System.out.println(arr[j]);
			}
		}

	}

}
