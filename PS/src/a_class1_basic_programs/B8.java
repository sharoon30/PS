package a_class1_basic_programs;

import java.util.Scanner;

public class B8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pattern number");
				
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=i;j<number;j++) {
				System.out.print(" ");
			}
			if(i%2==0) {
			for(int j=1;j<=i;j++) {
				System.out.print("@"+" ");
			}
			}
			else {
				for(int j=1;j<=i;j++) {
					System.out.print("#"+" ");
				}
			}
			System.out.println();
		}
	}

}
