package practice;
import java.util.*;
public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		JourneyCalculator jc=new JourneyCalculator();
		System.out.printf("%.2f",jc.calculateDistance(a,b));
	}

}
