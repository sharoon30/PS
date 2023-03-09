package a1_interviewPrograms;
import java.util.Scanner;
public class D4_DemoDuplicatesRemoving {
	public static void main(String[] args) {
		String s1="my name is sharoon";
		s1=s1.replace(" ", "");
		String s2=" ";
		int count=0;
		int k=0;
		char[] c=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					s2=s2+c[i];
					break;
				}
				else if(c[i]!=c[j]) {
				c[k]=c[i];
			}
		}
	}
		for(int i=0;i<k;i++) {
			System.out.println(c[i]);
		}
		System.out.println(s2);
}
}