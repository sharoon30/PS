package z_Exception_Handeling;

public class Tag {
	public static void main(String[] args) {
		try {
			System.out.println(12);
			System.out.println(10/0);
		}finally {
			System.out.println("no exception handler");
		}
	}
}
