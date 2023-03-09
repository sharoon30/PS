package a_class1_basic_programs;
//difference between print and println;
import java.util.Scanner;
public class Demo {
	 static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	switch(input) {
		case "monday":System.out.println("it is monday");
		break;
		case " tuesday" : System.out.println("it is tuesday");
		break;
		case "wednesday":System.out.println("it is wednesday");
		break;

	}
}
}