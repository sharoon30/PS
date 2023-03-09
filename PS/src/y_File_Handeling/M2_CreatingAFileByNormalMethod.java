package y_File_Handeling;

import java.io.File;
import java.io.IOException;

public class M2_CreatingAFileByNormalMethod {
	public static void main(String[] args) throws IOException {
		File file=new File("Demo");
		if(!(file.exists())) {
			file.createNewFile();
		}
		else {
			System.out.println("The file is already existed");
		}
		
	}

}
