import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n<2) {
			System.out.println("Its not a prime number");}
		else{
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					System.out.println("It is not a prime number");
					return;
				}
			}
			System.out.println("It is a prime number");
			}
		}
}
