package z_Exception_Handeling;

public class C1_HandlingTheException {
	public static void main(String[] args) {
		int a,b,c;
		a=10;b=0;
		try {
		c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("The exception handled");
			System.out.println("Anything divided by zero is infinity");
		}
	}

}
