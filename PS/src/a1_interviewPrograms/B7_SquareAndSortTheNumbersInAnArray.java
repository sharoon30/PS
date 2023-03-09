package a1_interviewPrograms;

import java.util.Scanner;

public class B7_SquareAndSortTheNumbersInAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("After squaring");
		for(int i=0;i<size;i++) {
			a[i]=a[i]*a[i];
		}
		for(int i =0;i<size;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Now after sorting ");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;

				}

			}
		}
		for(int i =0;i<size;i++) {
			System.out.println(a[i]);
		}

	}

}


