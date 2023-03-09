package y_File_Handeling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Xyz {
	public static void main(String[] args) throws Throwable{
		File file=new File("testYantra");
		FileOutputStream fos=new FileOutputStream(file);
		String s1="i am learn13245";
		byte b[]=s1.getBytes();
		fos.write(b);
		System.out.println("data has written successfully");
		fos.close();
		FileInputStream fis=new FileInputStream(file);
		int i=fis.read();
		while(i!=-1) {
			char c=(char)i;
			System.out.print(c);
			i=fis.read();
		}
		
		
		
}
}