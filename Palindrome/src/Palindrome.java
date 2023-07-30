
public class Palindrome {
	public static boolean palindromeCheck(int n) {
		Palindrome p=new Palindrome();
		int rev=p.reverse(n);
		if(rev==n) {
			return true;
		}
		return false;
	}
	int reverse(int n) {
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
}
