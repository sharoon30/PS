package a1_interviewPrograms;

import java.util.Scanner;

public class A5_BubbleSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter "+size+" values");
		for(int i =0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("before sorting \n |\n v  ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("After sorting \n |\n v ");
		
		//let me sort it ;
		for(int i =0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
			for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
}
