package com.kodnest.pattern.level5;

public class Pattern2 {

	public static void main(String[] args) {
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
