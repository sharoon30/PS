package y_File_Handeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class O_FileReadingTheDataUsingScanner {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\\\\\\\Users\\\\\\\\Sharoon\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\Prog//Intel.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			String info=sc.nextLine();
			System.out.println(info);
		}
	}
}
