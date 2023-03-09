package a1_interviewPrograms;

import java.util.Scanner;

public class A3_IntegerPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check whether it is palindrome or not ");
		int number=sc.nextInt();
		int temp=number;
		int reminder;
		int sum=0;
		while(number>0) {
			reminder=number%10;
			sum=(sum*10)+reminder;
			number=number/10;
		}
		if(temp==sum) {
		
			System.out.println("it is a palindrome number ");
		}
		else {
			System.out.println("it is not a palindrome number");
		}
	}

}
