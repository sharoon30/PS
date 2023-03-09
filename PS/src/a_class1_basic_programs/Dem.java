package a_class1_basic_programs;

import java.util.Scanner;

public class Dem {
	public static void main(String[] args) {
		String s1="java";
		String s2="";
		char c1;
		char c2;
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(i==0||i==3) {
				c1=c[i];
				c1=Character.toUpperCase(c1);
				System.out.print(c1);
			}
			else {
				System.out.print(c[i]);
			}
		}
		
			
		}
			
	}

