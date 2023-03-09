package a1_patterns;
import java.util.Scanner;
public class ToCheckWhetherTheCharacterIsUpperCaseOrLowerCase {
	public static void main(String[] args) {
		//use scanner for taking the input from the user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to check whether the given character is uppercase or lowercase");
		char var = sc.next().charAt(0);
		if(var>='A' && var<='Z') {
			System.out.println("uppercase");
		}
		else {
			System.out.println("lowercase");
		}
	}
}