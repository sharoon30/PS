package a1_interviewPrograms;

import java.util.Scanner;

public class C1_CountTheCharInSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter some string ");
		String s1=sc.nextLine();
		s1=s1.replace(" ", "");
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		int count=0;
		for(int i=0;i<c.length;i++) {
			count++;
		}
		System.out.println(count);
	}

}
