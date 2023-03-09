package a1_interviewPrograms;

import java.util.Scanner;

public class A7_Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int number=sc.nextInt();
		int fact=1;
		for(int i=number;i>0;i--) {
			fact=fact*i;
		}
		System.out.println("The factorial of the number is "+fact);
	}

}
