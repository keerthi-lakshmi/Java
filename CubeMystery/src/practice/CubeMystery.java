package practice;
import java.util.*;
public class CubeMystery{
	public static int cubeNumber(int num) {
		return num*num*num;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(cubeNumber(num));
		
	}
}
