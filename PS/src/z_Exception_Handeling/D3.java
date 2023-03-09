package z_Exception_Handeling;

public class D3 {
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
			try {
			System.out.println(1/0);
			}
			catch(Exception e) {
				System.out.println("arith handled");
			}
			finally {
				System.out.println("finally block getting executed");
			}
		}
			catch(Exception e) {
				try {
					System.out.println(1/0);
				}
				catch(Exception f) {
					System.out.println("catch exeption handled");
				}
				finally {
					System.out.println("catch finally got executed");
				}
				
			}
		finally {
			System.out.println("tiger final");
		}
	}

}
