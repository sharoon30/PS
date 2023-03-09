package e_arrays;
import java.util.Scanner;
//user should give the  size and input and find the greatest number present in the array
public class A6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the values ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	    int max=a[0];
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]>max) {
	    		max=a[i];
	    	}
	    }System.out.println(max);
	}
	
	

}
