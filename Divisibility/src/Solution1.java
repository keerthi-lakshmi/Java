import java.util.*;
public class Solution1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>100) {
			printNumbers(n);
		}
		else {
			System.out.println("Enter number greater than 100");
		}
	}
	public static void printNumbers(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

}
