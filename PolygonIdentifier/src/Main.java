import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sides=sc.nextInt();
		identifyPolygon(sides);
	}
	public static void identifyPolygon(int sides) {
		if(sides==3) {
			System.out.println("Triangle");
		}
		else if(sides==4) {
			System.out.println("Quadrilateral");
		}
		else if(sides==5) {
			System.out.println("Pentagon");
		}
		else {
			System.out.println("Polygon");
		}
	}

}
