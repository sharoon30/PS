package z_Exception_Handeling;

public class C2_TryAndCatch {
	public static void main(String[] args) {
		
		try {
			System.out.println(1);
			System.out.println(2/0);
			System.out.println(3);
			System.out.println(4);
		    System.out.println(5);
		}
		
		catch(NullPointerException e) {
			System.out.println("Null poiter exception handled");
		}
		/*
		 * catch(ArithmeticException e) { System.out.println("exception handled"); }
		 */	catch(RuntimeException e) {
			System.out.println("Runtime exception handled");
		}
		
		System.out.println(7);
		System.out.println(8);
		
		
	}		
}

