package a1_interviewPrograms;

import java.util.Scanner;

//if someone askes to remove the duplicate word present in the string this words can be removed
public class E1_ToRemoveDuplicateWordsPresentInAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string with duplicate words");
		String s1=sc.nextLine();
		int count=0;
		s1=s1.toLowerCase();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			for(int j=i+1;j<s2.length;j++) {
				if(s2[i].equals(s2[j])) {
					count++;
					s2[j]="0";
				}
			}
			if(count>0 && s2[i]!="0") {
				System.out.print(s2[i]+" ");
			}
		}
		
		
	}

}
