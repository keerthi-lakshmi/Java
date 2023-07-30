
public class OddNumDivisibleBy5 {

	public static void main(String[] args) {
		System.out.println("Numbers divisible  5 and odd");
		oddFiveDivisible();
}
	public static void oddFiveDivisible(){
		for(int i=1;i<=100;i++) {
			if(i%2!=0 && i%5==0) {
				System.out.println(i);
			}
		}
	}
}
