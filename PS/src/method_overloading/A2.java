package method_overloading;
import java.util.Scanner ;
// to display n number of values //so we need to create an array 
public class A2 {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	     add(10,44,88,99,66,44);
	     sub(20,10,5);
	    
	     
	}
	public static void add(int...array) {
		int c=0;
		for(int i=0;i<array.length;i++) {
		     c=c+array[i];
		}
		System.out.println(c);
		
		
	}
	public static void sub(int...array) {
		   int c=array[0];
		   for(int i=1;i<array.length;i++) {
			   
			   c=c-array[i];
		   }
		   System.out.println(c);
		   
	}

}
