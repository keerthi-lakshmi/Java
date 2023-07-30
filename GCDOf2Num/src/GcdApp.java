import java.util.*;
public class GcdApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		GcdApp gcd=new GcdApp();
		int res=gcd.findgcd(m, n);
		System.out.println("GCD is "+res);

	}
	int findgcd(int m,int n) {
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}
		
		return m;

}
}
