import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean res=Palindrome.palindromeCheck(n);
		if(res==true) {
			System.out.println(n+" is a palindrome");
		}
		else {
			System.out.println(n+" is not a palindrome");
		}

	}

}
