import java.util.*;
public class Main {
	public static void calculateSumOfSeries(int n) {
		double sum=1;
		for(double i=2;i<=n;i++) {
			
			sum+=(1/i);
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=sc.nextInt();
		calculateSumOfSeries(n);
	}

}
