package y_File_Handeling;
import java.io.*;
public class File1 {
	public static void main(String[] args) throws IOException {
		File f1=new File("roz.txt");
		if(!f1.exists()) {
		f1.createNewFile();
		System.out.println("file created");
		}
		else {
			System.out.println("already exists ");
		}
		FileOutputStream f2=new FileOutputStream(f1);
		String s1="i am sharon";
		f2.write(s1.getBytes());
		f2.close();
		FileInputStream f3=new FileInputStream(f1);
		int i=f3.read();
		while(!(i==-1)) {
			char c=(char)i;
			System.out.print(c);
			i=f3.read();
			
		}
		f3.close();
		
	}

}
