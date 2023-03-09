package a1_interviewPrograms;

import java.util.Scanner;
import java.util.TreeMap;

public class B1_CountTheCharacterAndSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		s1=s1.replace(" ","");
		s1=s1.toLowerCase();
		TreeMap tm=new TreeMap<>();
		int count=0;
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			count=0;
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
				}
			}
			tm.put(c[i], count);

		}
		System.out.println(tm);
		int count1=0;
		System.out.println("enter the character");
		char c1=sc.next().charAt(0);

		for(int i=0;i<c.length;i++) {
			if(c1==c[i]) {
				count1++;
			}
		}
		System.out.println(c1+" "+count1);
	}

}
