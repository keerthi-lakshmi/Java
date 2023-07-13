package practice;
import java.util.*;
public class PowerofSquares {
	public static int squareNumber(int num) {
		return num*num;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(squareNumber(num));
		
	}
}
