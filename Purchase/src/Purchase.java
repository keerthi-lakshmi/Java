import java.util.*;
public class Purchase {
	public static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount>100) {
			System.out.println("Discount Applicable");
		}
		else{
			System.out.println("Discount Not Applicable");
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter purchase amount");
		double purchaseAmount=sc.nextDouble();
		checkDiscount(purchaseAmount);
		
	}
	
}
