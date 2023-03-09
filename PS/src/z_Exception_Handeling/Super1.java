package z_Exception_Handeling;
import java.io.File;
public class Super1 {
	public static void main(String[] args) throws Super{
		int age =10;
		try {
		if(age>8) {
			throw new Super("hey man");
		}
		}
		catch (Super e) {
			Super sc=new Super("hey mental");
			System.out.println(sc.getMessage());
			
		}
		
	}
}