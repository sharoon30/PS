package d_scanner_class;
import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 variables ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		System.out.println("enter a string");
		String d=sc.nextLine();
		System.out.println(d);
		System.out.println("enter a name ");
		char e=sc.next().charAt(0);
		System.out.println(e);
	
	}
}
