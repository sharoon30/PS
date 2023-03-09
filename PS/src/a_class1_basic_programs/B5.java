package a_class1_basic_programs;

import java.util.Scanner;

class B5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("pattern number ");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=i;j<number;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

