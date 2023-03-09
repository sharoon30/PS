package y_File_Handeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandeling2 {
	public static void main(String[] args) throws IOException  {
		File file=new File("newfile1.text");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("New file is created!!!");
		}
		else {
			System.out.println("file is already there!!");
		}
		FileOutputStream fos=new FileOutputStream(file);
		String s1="Im creating a new File ";
		fos.write(s1.getBytes());
		fos.close();		
		FileInputStream fis=new FileInputStream(file);
		int i=fis.read();
		while(!(i==-1)) {
			char c=(char)i;
			System.out.print(c);
			i=fis.read();
		}
		fis.close();
	}
	


}
