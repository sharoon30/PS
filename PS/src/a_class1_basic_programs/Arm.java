package a_class1_basic_programs;
import java.util.Scanner;
public class Arm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check whether it is arm strong number");
		int number=sc.nextInt();
		int temp=number;
		int temp1=temp;
		System.out.println(number);
		int count=0;
		while(number!=0) {
		number=number/10;
		count++;
		}
		System.out.println("the digits present in the number is : "+count);
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			sum=(int) (sum+Math.pow(rem, count));
			temp=temp/10;
		}
		if(temp1==sum) {
			System.out.println("it is a ASNumber");
		}
		else {
			System.out.println("not a arm");
		}	
	}
}
