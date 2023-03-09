package y_File_Handeling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class N1_CreatingAFile {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\File/mer_c.txt");
		FileOutputStream fos=new FileOutputStream(file);
		String s1="my name is sharun";
		if(!(file.exists())) {
			file.createNewFile();
			System.out.println("The file is created");
		}
		else {
			System.out.println("The file is already present!!!");
		}
		fos.write(s1.getBytes());
		fos.close();
	}

}
