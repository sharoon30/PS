package z_Exception_Handeling;
import java.io.*;
public class A3 {
	public static void main(String[] args) {
		int i=10;
		if(i<18) {
		throw new A2("You cannot vote");
		}
		else {
			System.out.println();
		}
	}

}
