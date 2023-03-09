package e_arrays;

import java.util.Scanner;

public class B9_AddOddIndexFrom2DArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size");
		int rsize=sc.nextInt();
		System.out.println("enter the column size");
		int csize=sc.nextInt();
		int a[][]=new int[rsize][csize];
		System.out.println("enter the values into it");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
			for(int j=0;j<a.length;j++) {
				if(j%2!=0) {
					System.out.print(a[i][j]);
				}
			}
			System.out.println();
			}
		}		
	}

}
