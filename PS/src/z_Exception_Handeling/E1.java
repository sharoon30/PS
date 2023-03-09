package z_Exception_Handeling;

public class E1 {
	public static void main(String[] args) {
		try {
		System.out.println(1/0);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled");
		}
		System.out.println(5);
		System.out.println(6);
	}
}