package y_File_Handeling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class M1_CreatingNewFile {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\\\Users\\\\Sharoon\\\\OneDrive\\\\Documents\\\\Prog//Intel.txt");
		if(!file.exists()) {
			System.out.println(file.createNewFile());
		}
		else {
			System.out.println("file is already present in the project ");
		}
		FileOutputStream fos=new FileOutputStream(file);
		String text="my name is Sharoon";
		byte[] b=text.getBytes();
		fos.write(b);
		fos.close();
	}
}
