package com.kodnest.pattern.level4;

public class Pattern4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("#");}
			for(int j=1;j<=i;j++) {
				System.out.print("*");}
			System.out.println();	
		}
	}

}
