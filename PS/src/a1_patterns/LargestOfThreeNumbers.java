package a1_patterns;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		//Use scanner class for taking the input from the users
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the value of 1st number");
		int a = sc.nextInt();
		System.out.println("enter the value for 2nd number");
		int b = sc.nextInt();
		System.out.println("enter the value for 3rd number");
		int c = sc.nextInt();
		//comparing all the values so use if and else 
		
		if(a>b && a>c) {
			System.out.println(a+" is the largest value");
		}
		else if(b>a && b>c){
			System.out.println(b+" is the largest value ");
		}
		else {
			System.out.println(c+" is the largest value");
		}
		
	}
}
