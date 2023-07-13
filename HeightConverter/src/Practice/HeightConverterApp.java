package Practice;
import java.util.*;
public class HeightConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double in=sc.nextDouble();
		HeightConverter hc=new HeightConverter();
		System.out.println(hc.convertInchesToFeet(in));
	}

}
