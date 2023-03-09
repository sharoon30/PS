package a_class1_basic_programs;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int number = sc.nextInt();
		int temp=number;
		int sum=0;;
		
		while(number>0) {
			int fact=1;
			int reminder=number%10;
			for(int j=reminder;j>=1;j--) {
				fact =fact * j;
			}
			sum=sum+fact;
			number=number/10;
		}
		
		if(temp==sum) {
			System.out.println("strong number");
		}
		else {
			System.out.println("it is not a strong number ");
		}
	}
}
