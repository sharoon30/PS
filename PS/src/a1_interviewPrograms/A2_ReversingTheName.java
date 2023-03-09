package a1_interviewPrograms;

import java.util.Scanner;

public class A2_ReversingTheName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name ");
		String s1=sc.nextLine();
		char c[]=s1.toCharArray();
	    for(int i=c.length-1;i>=0;i--) {
	    	System.out.print(c[i]);
	    }
	}

}
