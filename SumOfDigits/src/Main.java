import java.util.*;
public class Main {
	public static void calculateSumOfDigits(int n) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		calculateSumOfDigits(n);

	}

}
