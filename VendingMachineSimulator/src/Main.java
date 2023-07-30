import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String productCode=sc.next();
		getProduct(productCode);

	}
	public static void getProduct(String productCode){
		if(productCode.equals("P01")) {
			System.out.println("Coca Cola");
		}
		else if(productCode.equals("P02")) {
			System.out.println("Pepsi");
		}
		else if(productCode.equals("P03")) {
			System.out.println("ThumpsUp");
		}
		else if(productCode.equals("P04")) {
			System.out.println("Frooti");
		}
		else {
			System.out.println("Enter Correct product Code");
		}
		
	}

}
