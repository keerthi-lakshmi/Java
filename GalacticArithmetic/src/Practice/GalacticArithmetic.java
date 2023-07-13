package Practice;
import java.util.*;
public class GalacticArithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long result=galacticAddition(a,b);
		System.out.println(result);
	}
	public static long galacticAddition(long a,long b) {
		return a+b;
	}
	

}
