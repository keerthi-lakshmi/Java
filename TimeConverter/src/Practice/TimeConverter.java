package Practice;
import java.util.*;
public class TimeConverter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		System.out.println(convertToHours(m));
	}
	public static double convertToHours(int minutes) {
		return (minutes/60.0);
	}
}
