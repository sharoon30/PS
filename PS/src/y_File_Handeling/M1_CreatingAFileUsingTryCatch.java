package y_File_Handeling;

import java.io.File;

public class M1_CreatingAFileUsingTryCatch {
	public static void main(String[] args) {
		File file=new File("Demo");
		if(!(file.exists())) {
		try {
			file.createNewFile();
			System.out.println("The file is created");
		}
		catch(Exception e) {
			System.out.println("Unable to create the file ");
		}
		}
	}

}
