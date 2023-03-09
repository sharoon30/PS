package a_class1_basic_programs_B;

import java.util.Arrays;
import java.util.Scanner;

class DEMO {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		String split[]=s1.split(" ");
		int count=0;
		for(int i=0;i<split.length;i++) {
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equals(split[j])) {
					count++;
					split[j]="0";
				}
			}
			if(count>1 && split[i]!="0") {
				System.out.println(split[i]);
			}
		}
	}
}
