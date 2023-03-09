package c_method;
//method to call static and non static method inside a main method 
public class A3 {
	public static void add(int a,int b) {//called method 
		int c= a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {//calling method
		add(2,6);//method called statement 
	}
	

}
