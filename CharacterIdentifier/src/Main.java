import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		identifyCharacter(ch);
	}
	public static void identifyCharacter(char ch) {
		if(Character.isDigit(ch)) {
			System.out.println("Digit");
			}
		else if(Character.isLowerCase(ch)) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("Lower-case vowel");
			}
			else {
				System.out.println("Lower-case consonat");
			}
		}
		else if(Character.isUpperCase(ch)) {
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.println("Upper-case vowel");
			}
			else {
				System.out.println("Upper-case consonat");
			}
		}
		else {
			System.out.println("Special Character");
		}
	
		
	}
	
}
