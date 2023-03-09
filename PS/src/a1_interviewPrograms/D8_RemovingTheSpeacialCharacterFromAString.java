package a1_interviewPrograms;

import java.util.Scanner;

public class D8_RemovingTheSpeacialCharacterFromAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string containing character alphabet and special character ");
		String s1=sc.nextLine();
		char c[]=s1.toCharArray();
		String result="";
		for(int i=0;i<c.length;i++) {
			if(Character.isAlphabetic(c[i])||Character.isDigit(c[i])) {
				result=result+c[i];
			}
		}
		System.out.println(result);
	}
}
