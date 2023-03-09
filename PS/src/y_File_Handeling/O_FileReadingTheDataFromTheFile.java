package y_File_Handeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class O_FileReadingTheDataFromTheFile {
	public static void main(String[] args) throws Exception{
		File file=new File("C:\\\\Users\\\\Sharoon\\\\OneDrive\\\\Documents\\\\Prog//tel.txt");
		FileInputStream fis=new FileInputStream(file);
		int i=fis.read();
		System.out.println(i);
		while(!(i==-1)) {
			char c=(char)i;
			System.out.print(c);
			i=fis.read();
		}
		fis.close();
	}
}
