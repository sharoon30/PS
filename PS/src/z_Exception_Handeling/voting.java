package z_Exception_Handeling;

import java.util.Scanner;

public class voting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age for voting");
		int age=sc.nextInt();
		
		
		if(age>=18) {
			System.out.println("You are eligible for voting");
		}
		else {
			Grapes g=new Grapes("You are underage , so u cannot vote!!!");
			throw g;
		}
	}

	

}
