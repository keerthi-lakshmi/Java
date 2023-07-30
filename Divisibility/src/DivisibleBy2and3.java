
public final class DivisibleBy2and3 {

	public static void main(String[] args) {
		System.out.println("Numbers divisible by 2 & 3");
		twoThreeDivisible();
}
	public static void twoThreeDivisible(){
		for(int i=1;i<=100;i++) {
			if(i%2==0 && i%3==0) {
				System.out.println(i);
			}
		}
	}
}
