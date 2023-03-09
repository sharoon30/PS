package a_class1_basic_programs;
import java.util.Scanner;
public class Dms_if_else {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter the values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("the values are ");
		for(int i=0;i<a.length;i++) {
			if(a[i]>=18 && a[i]<40) {
				System.out.println(a[i]+"<----this age is eligible to vote");
				
			}
			else if(a[i]<18) {
				System.out.println("underage to vote "+a[i]);
			}
			else {
				System.out.println("over age----> "+a[i]);				
			}
			
		}
	}
	
}
