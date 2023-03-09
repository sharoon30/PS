package y_File_Handeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandeling3 {
	public static void main(String[] args) throws IOException {
		File file=new File("sharun.txt");
		/*
		 * FileInputStream fis=new FileInputStream(file); int i =fis.read();
		 *//*
		 * while(!(i==-1)) { char c=(char)i; System.out.print(c); i=fis.read(); }
		 */
		FileWriter fw=new FileWriter(file);
		fw.write(" hey man how are u ");
		fw.write(" \n u r the coolest guy ");
		fw.close();
		Scanner sc=new Scanner(file);
		while(sc.hasNext()) {
			String line=sc.nextLine();
			System.out.println(line);
			
		}
		sc.close();
		
		
		
	}

}
