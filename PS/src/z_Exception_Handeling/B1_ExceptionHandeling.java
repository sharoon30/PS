package z_Exception_Handeling;

public class B1_ExceptionHandeling {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Handled");
		}
		System.out.println(4);
		System.out.println(5);
	}

}
