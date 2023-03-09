package a1_interviewPrograms;

import java.util.Scanner;

public class A8_FibonacciNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range ");
		int number=sc.nextInt();
		int a=0,b=1;
		int c=0;
		int sum=0;
		for(int i=1;i<=number;i++) {
			if(i==1||i==2) {
				System.out.print(c+" ");
				c++;
			}
			else {
				sum=a+b;
				System.out.print(sum+" ");
				a=b;
				b=sum;
			}
		}
		
		}
}

