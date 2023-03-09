package d_scanner_class;
import java.util.Scanner;
public class A3 {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string");
     String a=sc.nextLine();
     String b=sc.nextLine();

     String d=add(a,b);
     System.out.println(d);
	}
	public static String add(String a,String b) {
	      String c= a+b;
	      return c;
	}

}
