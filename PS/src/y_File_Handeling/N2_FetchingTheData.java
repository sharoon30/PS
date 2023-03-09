package y_File_Handeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class N2_FetchingTheData {
	public static void main(String[] args) throws FileNotFoundException {
		//In order to fetch the data into the console we were using FileInputStream class
		//We will be using Scanner class -hasNext()
		File file=new File("Karunya.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNext()) {
			String s1=sc.nextLine();
			System.out.println(s1);
		}
		sc.close();
	}
}
