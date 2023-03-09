package a_class1_basic_programs_B;

import java.util.Iterator;

public class Abc {
	public static void main(String[] args) {
		String s1="";
		for(int i=1;i<=5;i++) {
			s1="";
			for(int j=1;j<=i;j++) {
				s1+='*';
				System.out.print(s1);
			}
			
			System.out.println();
		}
	}
}
