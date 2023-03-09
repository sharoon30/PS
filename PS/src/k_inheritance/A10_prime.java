package k_inheritance;
import java.util.Scanner;
public class A10_prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=sc.nextInt();
		boolean key=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				key=false;
			}
		}
		if(key==true) {
			System.out.println(a+"it is a prime");
		}
		else {
			System.out.println(a+"it is not a prime ");
		}
	}
	
	

}
