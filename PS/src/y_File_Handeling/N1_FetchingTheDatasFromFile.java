package y_File_Handeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class N1_FetchingTheDatasFromFile {
	public static void main(String[] args) throws IOException {
		//in order to fetch the datas we use FileInputStream class
		File file=new File("Demo");
		FileInputStream fis=new FileInputStream(file);
		int i=fis.read(); //77,70
		while(!(i==-1)) {
			char c=(char)i;
			System.out.println(c);//
			i=fis.read();	
		}
		fis.close();
		
	}

}
