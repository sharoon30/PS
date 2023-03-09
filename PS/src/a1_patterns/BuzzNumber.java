package a1_patterns;

import java.util.Scanner;

public class BuzzNumber {
	public static void main(String[] args) {
		//Take input from the user so use scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a number ");
		int number = sc.nextInt();
		if(number%7==0 || number%10 == 7) {//number % 7 is gonna check whether the nunmber is divisble by 7  or not 
			//number % 10 is going to fetch the last digit and give 
			System.out.println("It is called as buzz number");
		}
		else {
			System.out.println("It is not a buzz number");
		}	
	}
}
