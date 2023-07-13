package Practice;
import java.util.*;
public class PlanetexplorerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		PlanetExplorer pe=new PlanetExplorer();
		System.out.println(pe.calculateSurfaceArea(r));
	}

}
