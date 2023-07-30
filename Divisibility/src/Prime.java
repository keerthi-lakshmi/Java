import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num for highest range");
		int n=sc.nextInt();
		int count=0;
		for(int i=3;i<=n;i++) {
		int res=checkIsPrime(i);
		if(res!=0) {
			count++;
			System.out.println(res);
			}
		}System.out.println("Number of Prime Numbers is "+count);
	}
	public static int checkIsPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return 0;
			}
		}return n;
	}

}
