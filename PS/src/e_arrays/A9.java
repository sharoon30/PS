package e_arrays;
//using the method and scanner class , find the smallest number 
import java.util.Scanner;
public class A9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		System.out.println("enter the values ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		A9 a1=new A9();
		a1.minimum(a);
	}
	public void minimum(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
		
		
	}

}
