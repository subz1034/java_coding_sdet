package com.coreJavaPrgms;

public class LargestnSmallestinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {67,12,13,65,43,89,82,77};
		System.out.println("Array elements : ");
		
		largestNsmallestElement(arr);
	}
	
	public static void largestNsmallestElement(int[] arr) {
		
		int max=arr[0],min=arr[0];
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println();
		System.out.println("Largest element : "+max);
		System.out.println("Smallest element : "+min);

	}

}
