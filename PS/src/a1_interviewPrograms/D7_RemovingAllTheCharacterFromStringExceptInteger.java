package a1_interviewPrograms;

import java.util.Scanner;

public class D7_RemovingAllTheCharacterFromStringExceptInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string along with the number ");
		String s1=sc.nextLine();
		String result="";
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(!Character.isAlphabetic(c[i])) {
				result=result+c[i];
			}
		}
		System.out.println(result);
	}
}
