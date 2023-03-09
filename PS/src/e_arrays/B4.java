package e_arrays;

import java.util.Scanner;

public class B4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rsize=sc.nextInt();
		int csize=sc.nextInt();
		int a[][]=new int[rsize][csize];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum=sum+a[i][j];
			}
		}
		System.out.println(sum);
	}

}
