package a1_interviewPrograms;

import java.util.Scanner;

public class B4_DecendingOrder {
	public static void main(String[] args) {
		int a[]= {1,8,6,5,3,2,4,7};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The values in decending order are : ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}	
	}
}
