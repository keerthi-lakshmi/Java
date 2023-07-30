
public class DivisibleBy3and5 {

	public static void main(String[] args) {
		System.out.println("Numbers divisible by 2 & 5");
		threeFiveDivisible();
}
	public static void threeFiveDivisible(){
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}

}
