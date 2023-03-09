package a1_interviewPrograms;

import java.util.Scanner;

public class E6_CountEachAndEveryCharCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		char c1[]=s1.toCharArray();
		for(char c='a';c<='z';c++) {
			int count=0;
			for(int i=0;i<c1.length;i++) {
				if(c==c1[i]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(c+" "+count);
			}
		}
	}
}
