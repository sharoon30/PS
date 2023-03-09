package a1_interviewPrograms;

import java.util.Scanner;
//not 100% correctS
public class E7_RemovingTheDuplicateWordsWithoutCollections {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		String result="";
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			if(!(result.contains(s2[i]))) {
				result=result+s2[i]+" ";
			}
		}
		System.out.println(result);
	}
}
