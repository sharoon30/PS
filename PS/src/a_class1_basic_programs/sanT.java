package a_class1_basic_programs;

import java.util.Arrays;
import java.util.Scanner;

public class sanT {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		System.out.println("enter the values ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int b[]=Arrays.copyOf(a,size+2);
		System.out.println("enter the 3 extra values ");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
	
	
	}

}
