package y_File_Handeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class M3_WritingSomeDataIntoTheFileUsingNormalMethod {
	public static void main(String[] args) throws IOException {
		File file=new File("Demo");
		FileOutputStream fos=new FileOutputStream(file);
		String s1="\n I stay in Bangalore , but i a native of coorg";
		byte b[]=s1.getBytes();
		fos.write(b);
		
		fos.close();
		
	}
	

}
