package com.kodnest.arrays.level1;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int len=sc.nextInt();
		int []arr=new int[len];
		System.out.println("Enter elements of array");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements of array are:");
		for(int i:arr) {
			System.out.print((i+5)+" ");
		}
		

	}

}
