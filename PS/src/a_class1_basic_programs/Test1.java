package a_class1_basic_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int b[]=Arrays.copyOf(a, size+2);
		System.out.println("enter the other 2 new values into the new array");
		for(int i=0;i<2;i++) {
			b[size+i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
