package y_File_Handeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class M5_FetchingTheDataUsingNormalMethod {
	public static void main(String[] args) throws IOException {
		File file=new File("Demo");
		FileInputStream fis=new FileInputStream(file);
		int i=fis.read();
		while(!(i==-1)) {
			char c=(char)i;
			System.out.print(c);
			i=fis.read();
		}
	}

}
