package practice;
import java.util.*;
public class SecretMessageDecoderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		SecretMessageDecoder smd=new SecretMessageDecoder();
		System.out.println(smd.decodeCharacter(a));
	}

}
