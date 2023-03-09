package y_File_Handeling;
import java.io.*;

public class A3 {
public static void main(String[] args) throws IOException  {
	File f1=new File("tap");
	if(!f1.exists()) {
		f1.createNewFile();
		System.out.println("file created");
	}
	FileOutputStream f2=new FileOutputStream(f1);
	String s1="yocohama jktyre";
	f2.write(s1.getBytes());
	f2.close();
	FileInputStream f3=new FileInputStream(f1);
	int i=f3.read();
	while(!(i==-1)) {
		char c1=(char)i;
		System.out.println(c1);
		i=f3.read();
	} f3.close();
	
}
}
