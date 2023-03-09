package e_arrays;
import java.util.Scanner;

// create a array for size 6 and add 6 names in it and display it 
public class A3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		System.out.println("enter the names ");
		String s[]=new String[size];
		for(int i=0;i<s.length;i++) {
			s[i]=sc.next();
			
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
