package a1_interviewPrograms;

import java.util.Scanner;
import java.util.TreeMap;

public class C3_CountTheSearchedAlphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s1=sc.nextLine();
		s1=s1.replace(" ", "");
		char c[]=s1.toCharArray();
		System.out.println("Enter the Letter to be searched ");
		int count1=0;
		char search=sc.next().charAt(0);
		for(int i=0;i<c.length;i++) {
			if(search==c[i]) {
				count1++;
			}
			
		}
		System.out.println(search+" "+count1);
	}
}
