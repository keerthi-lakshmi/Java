import java.util.*;
public class Main {
	public static void checkMultipleofTen(int n) {
		if(n%10==0) {
			System.out.println(n+" is a multiple of 10");
		}
		else {
			System.out.println(n+" is not a multiple of 10");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 integer");
		int n=sc.nextInt();
		checkMultipleofTen(n);
	}
	
}
