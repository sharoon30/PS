package c_method;
// create a method to print last number of the parameter 
public class A8 {
	public static void main(String[] args) {
		last_number(123);
	}
	public static void last_number(int a) {
		int b=a%10;
		System.out.println(b);
	}

}
