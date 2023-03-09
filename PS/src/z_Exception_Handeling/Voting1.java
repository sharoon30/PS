package z_Exception_Handeling;

public class Voting1 {
	public static void main(String[] args) {
		int age=10;
		if(age>18) {
			System.out.println("eligible");
		}
		else {
			throw new Young1("not eligible");
		}
		
	}

}
