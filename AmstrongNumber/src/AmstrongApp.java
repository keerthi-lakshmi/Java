import java.util.*;
public class AmstrongApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check it is amstrong or not");
		int n=sc.nextInt();
		boolean res=Amstrong.checkAmstrong(n);
		if(res==true) {
			System.out.println(n+" is a Amstrong Number");
		}
		else {
			System.out.println(n+" is not a Amstrong Number");
		}
	}

}
