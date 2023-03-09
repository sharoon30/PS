package y_File_Handeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class Tes {
	public static void main(String[] args) throws IOException {
		File file = new File("pen");
		if(file.exists()) {
			file.delete();
			System.out.println("deleted successfully");
		}
		else {
			System.out.println("file doesnt exists");
		}
		
		
		
		
	
	}

}
