package a1_interviewPrograms;

import java.util.Scanner;

public class B1_LinearSearch {	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size");
			int size=sc.nextInt();
			int a[]=new int[size];
			System.out.println("enter the"+size+"elements ");
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
			boolean check=false;
			System.out.println("enter the element that has to be found");
			int key=sc.nextInt();
			for(int i=0;i<a.length;i++) {
				if(a[i]==key) {
					check=true;
					break;
				}
			}
			if(check==true) {
				System.out.println("Element is present ");
			}
			else {
				System.out.println("elemnt is not present ");
			}
		}
	}
