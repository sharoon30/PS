package z_Exception_Handeling;

public class D2_IncasOfUnhandledException {
	public static void main(String[] args) {
		try {
			System.out.println("risky code");
			System.out.println(10/0);
			
		}
		catch(NullPointerException e) {
			System.out.println("Exception handled only for null pointer");
		}
		
		finally {
			System.out.println("im finally!!!");
		}
		
	}

}
