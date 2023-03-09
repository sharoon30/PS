package a1_interviewPrograms;

import java.util.Scanner;

public class B2_ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int number=sc.nextInt();
		int temp=number;
		int reminder,sum=0;
		int len=0;	
		int temp2=number;
		//to get the length of the number 
		while(number > 0) {
			number =number/10;
			len++;
		}
		System.out.println(len);
		
		while(temp2!=0) {
			reminder=temp2%10;//
			sum=(int) (sum+Math.pow(reminder, len));
			temp2=temp2/10;
		}
		System.out.println(temp+ " "+sum);
		if(temp==sum) {
			System.out.println("The number is Armstrong number ");
		}
		else {
			System.out.println("The number is not a Armstrong number");
		}
		
	}

}
