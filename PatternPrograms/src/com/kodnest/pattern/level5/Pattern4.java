package com.kodnest.pattern.level5;

public class Pattern4 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3-i;j++) {
				System.out.print(' ');
			}
			if(i==1) {
				System.out.print("*");
			}
			else if(i==3) {
				for(i=1;i<=5;i++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for(int j=1;j<=3-i;j++) {
					System.out.print(' ');
				}
				System.out.print("*");		
			}
			
			System.out.println();
		}
		char[][] mat=new char[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0||i==4||j==0||j==4) {
					System.out.print(mat[i][j]='*');
				}
				else {
					System.out.print(mat[i][j]=' ');
				}
			}
			System.out.println();	
		}

	}

}
