package c_method;
import java.util.Scanner;

public class A9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for a and b ");
		int a=sc.nextInt();
		int b=sc.nextInt()
				;	   int d=add(a,b);
				System.out.println(d);
	}
	public static int add(int a, int b) {
		int j=0,k=0;
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				j=j+i;
			}
			else {
				k=k+i;
			}
		}System.out.println(k);
	
		
		return j;
		
	}


}
