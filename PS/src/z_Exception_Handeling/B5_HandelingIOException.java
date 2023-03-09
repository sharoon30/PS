package z_Exception_Handeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class B5_HandelingIOException {
	public static void main(String[] args) {
		File file=new File("Memo");
		/*
		 * try { file.createNewFile(); System.out.println("New file created"); }
		 * catch(IOException e) { System.out.println("Unable to create the file");
		 * e.printStackTrace(); }
		 */
		try {
			FileWriter fw=new FileWriter(file);
			fw.write("this is the first file ");
			System.out.println("The data have been written");
			fw.close();
		}
          catch(FileNotFoundException ex) {
			System.out.println("There is no file to Write ");
		}
		
		catch(IOException e) {
			System.out.println("unable to Write the data into the file");
		}
		
		
		
	}

}
