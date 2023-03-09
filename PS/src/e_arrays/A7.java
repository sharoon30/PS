package e_arrays;
import java.util.Scanner;
public class A7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		A7 a7=new A7();
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		System.out.println("enter the values ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int m= a7.largest(a);
		System.out.println(m);
	}
	public int largest(int a[]) {
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}

}
