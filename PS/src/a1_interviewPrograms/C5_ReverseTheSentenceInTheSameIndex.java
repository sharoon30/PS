package a1_interviewPrograms;

import java.util.Scanner;

public class C5_ReverseTheSentenceInTheSameIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1[]=s.split(" ");
	String s2=" ";
	
	for(int i =0;i<s1.length;i++) {
		s2=s1[i];
		String rev=" ";
		/*
		 * for(int j=s2.length()-1;j>=0;j--) { r=r+s2.charAt(j); }
		 */
		for(int k=0;k<s2.length();k++) {
			rev=s2.charAt(k)+rev;
		}
		System.out.print(rev);
	}
	}
}
