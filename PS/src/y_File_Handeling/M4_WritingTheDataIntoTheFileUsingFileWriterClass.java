package y_File_Handeling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M4_WritingTheDataIntoTheFileUsingFileWriterClass {
	public static void main(String[] args) throws IOException {
		File file=new File("Demo");
		FileWriter fw=new FileWriter(file);
		fw.write("\n this is the text which is written by File writer");
		fw.close();
	}

}
