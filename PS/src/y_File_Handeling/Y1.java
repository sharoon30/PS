package y_File_Handeling;

import java.io.File;
import java.io.IOException;

public class Y1 {
public static void main(String[] args) throws IOException {
File file=new File("C:\\Users\\Sharoon\\OneDrive\\Documents\\Prog//Testyantra.txt");
if(!file.exists()) {//exists() is a method of file used to check the existance of the file
	file.createNewFile();//this method is used to create a file
	System.out.println("file is created successfully");
}
else {
	System.out.println("file is existing");
}
}
}
 