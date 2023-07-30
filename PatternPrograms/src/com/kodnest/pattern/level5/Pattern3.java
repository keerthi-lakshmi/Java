package com.kodnest.pattern.level5;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of lines");
		int n=sc.nextInt();
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3-i;j++) {
//				System.out.print(' ');
//			}
//			if(i==1) {
//				System.out.print("*");
//			}
//			else if(i==3) {
//				for(i=1;i<=5;i++) {
//					System.out.print("*");
//				}
//			}
//			else {
//				System.out.print("*");
//				for(int j=1;j<=3-i;j++) {
//					System.out.print(' ');
//				}
//				System.out.print("*");		
//			}
//			
//			System.out.println();
//		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(' ');
			}
			if(i==1) {
				System.out.print("*");
			}
			else if(i==n) {
				for(i=1;i<=2*n-1;i++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for(int j=1;j<=2*i-3;j++) {
					System.out.print(' ');
				}
				System.out.print("*");		
			}
			
			System.out.println();
		}

	}

}
