package y_File_Handeling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class N2_WriteTheData {
	public static void main(String[] args) throws IOException {
		//fileoutputstream- now we are using FileWriter class
		File file=new File("Karunya.txt");
		FileWriter fw=new FileWriter(file);
	//	String s1="im empty";
		fw.write("Im hero!!!");
		fw.close();
	}

}
