package b_type_casting;
//program to perform narrowing 
import java.util.Scanner;
public class N1 {
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		i=sc.nextInt();
		
		float j=i;//widening
		double k=j;//wideing 
		int m=(int)k;
		short n=(short)m;
		byte s=(byte)n;
		System.out.println(" the value ofint i: "+i);
		System.out.println(" the values of j after widening is : "+j);
		System.out.println(" the value after widening for double: "+k);
		System.out.println(" the value after narrowing for double to int :"+m);
		System.out.println(n);
		System.out.println(s);
		
		
	}
	

}
