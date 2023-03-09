package e_arrays;
import java.util.Scanner;
// to find which is the smallest number among the arrays 
public class A8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int size=sc.nextInt();
		System.out.println("enter the values");
		int a[]=new int[size];
		int i;
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}int min=a[0];
		for(i=0;i<a.length;i++) {
			
			if(a[i]<min) {
				min=a[i];
				
			}
		}
		System.out.println(" the smallest among the arrays is : "+min);
		
	}
	

}
