package e_arrays;
//program to get the product of all the elements in an array 
import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("enter the values ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int product=1;
		for(int i=0;i<a.length;i++) {
			product=product*a[i];
		}
		System.out.println(product);
	}

}
