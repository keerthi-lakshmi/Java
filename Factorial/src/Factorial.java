import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for factorial");
		int n=sc.nextInt();
		int prod=1;
		for(int i=1;i<=n;i++) {
			prod=prod*i;
		}
		System.out.println("Factorial of n is"+prod);
	}

}
