package d_scanner_class;
import java.util.Scanner;
// create a method and give the input using scanner class
public class A2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	
	add(a,b);

	
	}
	
	public static void add(int a , int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void add(double a,double b) {
		double c=a+b;
		System.out.println(c);
		
	}

}
