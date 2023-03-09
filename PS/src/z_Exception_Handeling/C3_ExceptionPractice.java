package z_Exception_Handeling;

public class C3_ExceptionPractice {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		try {
			System.out.println(a[6]);
		}
		catch(Exception e) {
			System.out.println("Exception handled ");
		}
		
		
	}

}
