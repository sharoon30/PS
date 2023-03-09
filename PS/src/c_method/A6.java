package c_method;
//create a method and pass one parameter is even or odd 
public class A6 {
	public static void main(String[] args) {
		eod(5);
	}
	public static  void eod(int a) {
	
		if (a%2==0) {
			System.out.println(a+" it is even");
		}
		else {
			System.out.println(a+" it is odd");
		}
	}

}