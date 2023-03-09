package a1_interviewPrograms;

import java.util.Scanner;

public class A4_StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to check whether it is a palindrome or not ");
		String s1=sc.nextLine();
		String s2=" ";
		String s3=" ";
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			s2=c[i]+s2;
		}
		for(int i=c.length-1;i>=0;i--) {
			s3=c[i]+s3;
		}
		if(s2.equals(s3)) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The String is not a palindrome");
		}
		
	}

}
