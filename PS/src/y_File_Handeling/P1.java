package y_File_Handeling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class P1 {
	public static void main(String[]  args) throws IOException {
		File file=new File("Demo H");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("file created");
		}
		else {
			System.out.println("not created");
		}
		FileWriter fw=new FileWriter(file);
		String s="renault duster \n tata harrier";
		fw.write(s);
		fw.close();
		System.out.println("file info stored");
		int count=0;
		Scanner sc=new Scanner(file);
		while(sc.hasNext()) {
			String s1=sc.nextLine();
			System.out.println(s1);
			count++;
		}
		System.out.println(count);	
	}
}


