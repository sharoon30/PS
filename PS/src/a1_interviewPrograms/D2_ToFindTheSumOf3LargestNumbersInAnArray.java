package a1_interviewPrograms;

import java.util.Scanner;

public class D2_ToFindTheSumOf3LargestNumbersInAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter "+size+" values inside the arrays ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int sum=0;
		for(int i=a.length-1;i>=2;i--) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
	}
}
