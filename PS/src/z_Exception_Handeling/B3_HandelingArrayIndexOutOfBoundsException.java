package z_Exception_Handeling;

public class B3_HandelingArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		arrayOut();
	}
	static void arrayOut() {
		try {
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException exep) {
			System.out.println("Exception is handled and the index which you have searched for is not present in the array");
		}
	}
}
