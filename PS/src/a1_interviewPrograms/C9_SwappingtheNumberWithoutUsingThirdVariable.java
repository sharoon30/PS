package a1_interviewPrograms;

import java.util.Scanner;

public class C9_SwappingtheNumberWithoutUsingThirdVariable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		int a=sc.nextInt(),b=sc.nextInt();
		System.out.println(a+" "+b);
		a=a+b;//30
		b=a-b;//10
		a=a-b;
		System.out.println(a+" "+b);
	}
}