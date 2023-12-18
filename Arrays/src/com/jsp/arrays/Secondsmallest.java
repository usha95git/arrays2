package com.jsp.arrays;

public class Secondsmallest {

	public static void main(String[] args) {
		int[] a = {3,4,5,8,1,8};
		int[] a1 = {9};
		for(int i=0;i<a.length;i++) {
			int s1 = a[0];
			int s2 = a1[0];
			for(int j=1;i<a.length;i++) {
				if(a[i]<s1) {
					s2=s1;
					s1=a[i];
	
				}
				else if(a[i]<s2||s1==s2) {
					s2=a[i];
				}
				System.out.println(s2);
			}
			
		}
		

	}

}
