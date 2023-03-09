package y_File_Handeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class N1_WritingTheDataIntoTheFile {
	public static void main(String[] args) throws IOException  {
		File file=new File("D:\\\\File/mer_c.txt");
		//to write the datas into the file so we use FileOutputStream class;
		FileOutputStream fos=new FileOutputStream(file);
		String s1="There are 5 people here!!!";
		byte b[]=s1.getBytes();
		fos.write(b);
		System.out.println("the datas are into the file");
	//	fos.write(s1.getBytes());
		fos.close();
	}
}
