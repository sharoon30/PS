package a1_interviewPrograms;

import java.util.Scanner;

public class E2_SumOfAllTheConsecutiveNumbersInAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string with alpha and numeric values");
		String s1=sc.nextLine();
		String s2[]=new String[20];
		String sum="";
		int k=0;
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(Character.isDigit(c[i])) {
				sum=sum+c[i];
			}else {
				if(sum!="") {
					s2[k]=sum;
					k++;
				}
				sum="";
			}
			
		}
		}

}
