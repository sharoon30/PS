package a_class1_basic_programs_B;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name ");
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
		if(s2.equals(s3)){
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
		
	}

}
