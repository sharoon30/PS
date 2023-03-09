package a1_interviewPrograms;

import java.util.Scanner;

public class A6_PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean key = true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				key=false;
			}
		}
		if(key==true) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a PrimeNumber");
		}
	}

}
