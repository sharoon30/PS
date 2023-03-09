package z_Exception_Handeling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingThroughTryAndCatch {
	public static void main(String[] args) {
		File file = new File("gun.txt");
		try {
			file.createNewFile();
			System.out.println("file created");
		}
		catch(IOException e) {
			System.out.println("exception handled");
		}
		try {
			FileOutputStream fos=new FileOutputStream(file);
			fos.write("hey babe".getBytes());
			System.out.println("ifo written successfully");
		}catch(IOException e) {
			System.out.println("exception handled");
		}	
	}
}
