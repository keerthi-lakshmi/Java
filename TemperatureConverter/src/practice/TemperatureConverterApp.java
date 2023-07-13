package practice;
import java.util.*;
public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		double a=sc.nextDouble();
		TemperatureConverter tc=new TemperatureConverter();
		System.out.println(tc.convertFahrenheittoCelsius(a));
	}

}
