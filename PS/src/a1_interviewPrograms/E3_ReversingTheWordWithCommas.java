package a1_interviewPrograms;

import java.util.Scanner;

public class E3_ReversingTheWordWithCommas {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s3="";
		
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			if(s2[i].startsWith("'")&&s2[i].endsWith("'")) {
				String s4="";
				char c[]=s2[i].toCharArray();
				for(int j=0;j<c.length;j++) {
					s4=c[j]+s4;
				}
				s2[i]=s4;
				s3=s3+s2[i];
			}else {
			s3=s3+s2[i];
		}}
		System.out.println(s3);
	}
}
