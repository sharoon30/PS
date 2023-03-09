package y_File_Handeling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class O_FileWritingUsingFileWriter {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\\\Users\\\\Sharoon\\\\OneDrive\\\\Documents\\\\Prog//Intel.txt");
		FileWriter fw=new FileWriter(file);
		if(file.exists()) {
			fw.write("my guru is prem ji \n");
			fw.write("he went to a project");
			fw.close();
			System.out.println("the info is written");
		}
		int count=0;
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			System.out.println(line);
			count++;
		}
		System.out.println(count);
	}

}
