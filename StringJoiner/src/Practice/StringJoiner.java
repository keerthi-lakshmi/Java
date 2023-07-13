package Practice;
import java.util.*;
public class StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(joinStrings(s1,s2));
	}
	public static String joinStrings(String str1,String str2) {
		return str1+str2;
	}
}
