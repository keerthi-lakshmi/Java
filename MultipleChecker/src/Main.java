import java.util.Scanner;
public class Main {
	public static void checkMultiple(int n1,int n2) {
		if(n1%n2==0) {
			System.out.println(n1+" is a multiple of "+n2);
		}
		else {
			System.out.println(n1+" is not a multiple of "+n2);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 integer");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		checkMultiple(n1,n2);
	}
	
}
