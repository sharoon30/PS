package xa_string_class;

import java.util.Scanner;

public class ReplaceMethod {
	public static void main(String[] args) {
		
		/*
		 * String s1="1 2  i 2 5 am 2 6 test engineer"; s1=s1.replace("neer","reen");
		 * System.out.println(s1); s1=s1.replaceAll("[a-z]", "");
		 * System.out.println(s1); String s2="the the i am "; s2=s2.replace("the","cat"
		 * ); System.out.println(s2); String s3="my empl id is bsbv12357";
		 * s3=s3.replaceAll("[0-5]", ""); System.out.println(s3);
		 */Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		String s4=sc.nextLine();
		System.out.println(s4);
		System.out.println();
		System.out.println("enter the old char/string");
		String oldString=sc.next();
		System.out.println("enter the new Char/string");
		String newString=sc.next();
		
		s4=s4.replace(oldString, newString);
		System.out.println(s4);
	}

}
