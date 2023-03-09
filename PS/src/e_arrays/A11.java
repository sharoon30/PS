package e_arrays;
import java.util.Scanner;
public class A11 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size  of the array");
	int size=s.nextInt();
	
	System.out.println("enter the values");
	
	//	int a[]= {10,20,30};
		int b[]=new int [size];
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		
	/*	for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
	}

}
