package a1_patterns;

import java.util.Scanner;

public class WeekDays {
	public static void main(String[] args) {
		//use scannner class for the input 
		System.out.println("Enter the day number ");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		if(day == 1) {
			System.out.println("monday");
		}
		else if(day == 2){
			System.out.println("Tuesday");
		}
		else if(day == 3){
			System.out.println("wednesday");
		}
		else if(day == 4){
			System.out.println("Thursday");
		}
		else if(day == 5){
			System.out.println("Friday");
		}
		else if(day == 6){
			System.out.println("saturday");
		}
		else if(day == 7){
			System.out.println("sunday");
		}
	}

}
