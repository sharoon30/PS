package a1_interviewPrograms;

import java.util.Scanner;

public class E5_RemovingDuplicatesCharacterWithoutCollection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s1=sc.nextLine();
		String res="";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(res.indexOf(c)==-1) {
				res=res+c;
			}
		}
		System.out.println(res);
	}

}
