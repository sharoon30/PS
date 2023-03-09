package a1_interviewPrograms;

import java.util.Scanner;

public class D1_CountingTheMultiplesOfGivenNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number upto the range in order to check the multiples");
		int number=sc.nextInt();
		System.out.println("enter the multiple of a number in order to count the number from 1 to "+number);
		int mulOfNum=sc.nextInt();
		for(int i=1; i<number;i++) {
			if(i%mulOfNum==0) {
				System.out.println(i);
			}
		}
	}
}
