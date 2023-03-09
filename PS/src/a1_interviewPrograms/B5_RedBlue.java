package a1_interviewPrograms;

import java.util.Scanner;

public class B5_RedBlue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=sc.nextInt();
		int red[]=new int[size];
		int blue[]=new int[size];
		System.out.println("Enter the values inside red block");
		for(int i=0;i<size;i++) {
		   red[i]=sc.nextInt();
		}
		System.out.println("Enter the values inside blue block ");
		for(int i=0;i<size;i++) {
			blue[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(red[i]>red[j]) {
					int temp=red[i];
					red[i]=red[j];
					red[j]=temp;
				}
			}
		}
		for(int i=0;i<blue.length;i++) {
			for(int j=i+1;j<blue.length;j++) {
				if(blue[i]>blue[j]) {
					int temp=blue[i];
					blue[i]=blue[j];
					blue[j]=temp;
				}
			}
		}
		System.out.println("The rows of red and blue according to their height are:");
		for(int i=0;i<size;i++) {
			if(i%2!=0) {
				System.out.print( "red: "+red[i]+ "blue: "+blue[i]);
			}
			System.out.println();
			if(i%2==0) {
				System.out.print( "red: "+red[i]+ "blue: "+blue[i]);
			}
		}
	}

}
