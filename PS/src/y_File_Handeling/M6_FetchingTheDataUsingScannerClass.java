package y_File_Handeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class M6_FetchingTheDataUsingScannerClass {
	public static void main(String[] args) throws IOException {
		File file=new File("roz");
		Scanner sc=new Scanner(file);
		while(sc.hasNext()) {
			String s1=sc.nextLine();
			System.out.println(s1);
		}
		sc.close();
	}
}
