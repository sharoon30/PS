package a1_interviewPrograms;

import java.util.Scanner;

public class A1_ReverseTheSentense {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some sentence");
		String s1=sc.nextLine();
		String s2[] =s1.split(" ");
		for(int i=s2.length-1;i>=0;i--) {
			System.out.print(s2[i]+" ");
		}
	}

}
