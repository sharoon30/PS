package a1_patterns;
import java.util.Scanner;
public class AgeRelated {
	public static void main(String[] args) {
		//use scannerclass to take the input from the users 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age of first person");
		int person1 = sc.nextInt();
		System.out.println("enter the age of second person");
		int person2 = sc.nextInt();
		System.out.println("enter the age of third person");
		int person3 = sc.nextInt();	
		//to determine the youngest and oldest 
		int youngest = (person1<person2)? ((person1<person3)?person1:person3):((person2<person3)?person2:person3);
		int oldest = (person1>person2)? ((person1>person3)?person1:person3):((person2>person3)?person2:person3);
		System.out.println("youngest = "+youngest);
		System.out.println("oldest = "+oldest);	
	}
}
