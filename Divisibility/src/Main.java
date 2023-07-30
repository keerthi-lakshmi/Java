import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr2[]=new int[100];
		int arr3[]=new int[100];
		int arr5[]=new int[100];
		int arr25[]=new int[100];
		int arr35[]=new int[100];
		int arrprime[]=new int[100];
		int arr23[]=new int[100];
		int arrodd5[]=new int[100];
		int arrevenprime[]=new int[100];
		int arroddprime[]=new int[100];
		
		for(int i=1;i<=100;i++) {
			int j=0;
			int k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0;
			if(i%2==0) {
				arr2[j]=i;
				j++;
			}
			if(i%3==0) {
				arr3[k]=i;
				k++;
			}
			if(i%5==0) {
				arr5[l]=i;
				l++;
			}
			if(i%5==0 && i%2==0) {
				arr25[m]=i;
				m++;
			}
			if(i%5==0 && i%3==0) {
				arr35[n]=i;
				n++;
			}
			/*
			if() {
				arrprime[o]=i;
				o++;
			}*/
			if(i%3==0 && i%2==0) {
				arr23[p]=i;
				p++;
			}
			if(i%5==0 && i%2!=0) {
				arrodd5[q]=i;
				q++;
			}
			/*
			if(i%5==0 && i%2==0) {
				arr25[m]=i;
				m++;
			}*/
			
		}
		for(int i=0;i<=100;i++) {
			 System.out.println(arr2[i]);
			 System.out.println(arr3[i]);
		}
		

	}

}
