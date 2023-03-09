package y_File_Handeling;
import java.io.File;
import java.io.IOException;
public class A1 {
	public static void main(String[] args) throws IOException {
		File file=new File("sharun.txt");
		if(!(file.exists())) {
			file.createNewFile();
			System.out.println("file created");
		}
		else {
			System.out.println("file not created");
		}
		
	}
	
	

}
