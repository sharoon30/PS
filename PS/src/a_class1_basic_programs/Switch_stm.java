package a_class1_basic_programs;
import java.util.*;
public class Switch_stm {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
	    String input=s.nextLine();
		switch(input) {
		case "a":System.out.println("vowel");
		break;
		case "e":System.out.println("vowel");
		break;
		case "i":System.out.println("vowel");
		break;
		case "o": System.out.println("vowel");
		break;
		case "u":System.out.println("vowel");
		break;
		default :System.out.println("not a vowel !!!");		
		 
		}
	}

}
