package a1_interviewPrograms;

import java.util.Scanner;
import java.util.TreeMap;

public class C2_CountTheAlphabets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s1=sc.nextLine();
		s1=s1.replace(" ", "");
		char c1[]=s1.toCharArray();
		TreeMap tm=new TreeMap();
		int count=0;
		for(int i=0;i<c1.length;i++) {
			count=0;
			for(int j=0;j<c1.length;j++) {
				if(c1[i]==c1[j]) {
					count++;
				}
			}
			tm.put(c1[i],count);
		}
		System.out.println(tm);	
	}

}
