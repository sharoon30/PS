package e_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values ");
		int a[]=new int[7];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();	
		}
		int j=0;
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j]=a[i];
				j++;
			}
			
		}
		a[j]=a[a.length-1];
		for(int i=0;i<=j;i++) {
			System.out.println(a[i]);
		}
	}

}
