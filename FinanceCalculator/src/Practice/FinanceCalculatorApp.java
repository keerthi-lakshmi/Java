package Practice;
import java.util.*;
public class FinanceCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double t=sc.nextDouble();
		FinanceCalculator fc=new FinanceCalculator();
		System.out.println(fc.calculateSimpleInterest(p,r,t));
	}

}
