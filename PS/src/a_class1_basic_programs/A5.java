package a_class1_basic_programs;
//to find large number in an array 
import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {
		int j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		 j=a[0];
		if(j<a[i]) {
			j=a[i];
			System.out.println("the largest number is "+j);
			
		}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		
		
		
	}

}
