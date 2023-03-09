package a_class1_basic_programs;
import java.util.Scanner;
//to find the greatest of three using ternary operator
public class Greater_3no {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		int e,f,g;
		int d=(a>b?((a>c)?a:c):((b>c)?b:c));
		System.out.println("the greatest of three number using ternary operator is: "+d);
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 2 number ");
		e=s.nextInt();
		f=s.nextInt();
		g=e>f?e:f;
		System.out.println("the greatest nnumber is:"+g);
		
	}

}
