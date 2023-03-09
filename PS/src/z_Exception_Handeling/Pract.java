package z_Exception_Handeling;

import java.util.Scanner;

public class Pract {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("eligible for voting");
		}
		else {
			Young y=new Young("You cannot vote ");
			throw y;
		}
	}

}
