import java.util.*;
public class Fibbonaci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fSeries(n);

	}
	public static void fSeries(int n) {
		int fib1=0;
		int fib2=1;
		if(n==1) {
			System.out.println(fib1);
		}
		else if(n==2)
			System.out.println(fib1+" "+fib2);
		else {
			System.out.print(fib1+" "+fib2+" ");
			for(int i=3;i<=n;i++) {
			int nextnum=fib1+fib2;
			System.out.print(nextnum+" ");
			fib1=fib2;
			fib2=nextnum;}
		}
	}

}
