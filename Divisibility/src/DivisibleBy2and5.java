
public class DivisibleBy2and5 {
	
	public static void main(String[] args){
			System.out.println("Numbers divisible by 2 & 5");
			twoFiveDivisible();
	}
		public static void twoFiveDivisible(){
			for(int i=1;i<=100;i++) {
				if(i%2==0 && i%5==0) {
					System.out.println(i);
				}
			}
		}

}
