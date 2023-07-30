import java.util.*;
public class SumOfNaturalNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a natural number");
		int n=sc.nextInt();
		System.out.println("Sum is"+sumofn(n));
		

	}
	public static int sumofn(int n) {
		int sum=0;
		sum=(n*(n+1))/2;
		return(sum);
	}

}
