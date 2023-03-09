package z_Exception_Handeling;

public class B4_HandlingNullPointerException {
	public static void main(String[] args) {
		int a[]=null;
		try {
		System.out.println(a[1]);
		}
		catch(NullPointerException e) {
			System.out.println("The exception Handled");
			System.out.println("The array is Null ");
		}
	}

}
