package z_Exception_Handeling;

public class Handling {
	public static void main(String[] args) {
		try {
			System.out.println("risky code");
			
			System.out.println("kannan");		
		}
		catch(Exception e) {
			System.out.println("catching code");
		}
		finally {
			try {
			System.out.println(10/0);
			}
			catch( Exception e) {
				System.out.println("handled");
			}
			System.out.println("Finally code");
		}
		
	}

}
