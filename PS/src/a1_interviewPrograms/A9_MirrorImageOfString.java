package a1_interviewPrograms;

import java.util.Scanner;

public class A9_MirrorImageOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name or a string");
		String s1=sc.nextLine();
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		String result=new String(sb);
		System.out.println(result);
	}

}
