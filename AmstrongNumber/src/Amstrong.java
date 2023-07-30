
public class Amstrong {
	public static boolean checkAmstrong(int n) {
		int sum=0;
		int num=n;
		int count=count(n);
		while(n!=0) {
			int rem=n%10;
			sum+=Math.pow(rem,count);
			n/=10;
		}
		if(num==sum) {
			return true;
		}
		return false;
	}
	public static int count(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	}
}
