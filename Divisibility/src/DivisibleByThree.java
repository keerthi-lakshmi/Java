
public class DivisibleByThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Numbers divisible by 3");
		threeDivisible();
	}
	public static void threeDivisible() {
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}

}
