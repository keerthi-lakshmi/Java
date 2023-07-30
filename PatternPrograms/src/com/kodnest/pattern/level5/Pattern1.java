package com.kodnest.pattern.level5;

public class Pattern1 {

	public static void main(String[] args) {
		char[][] mat=new char[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==0||i==2||j==0||j==2) {
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
