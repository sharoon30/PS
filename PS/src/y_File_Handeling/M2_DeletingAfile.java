package y_File_Handeling;

import java.io.File;

public class M2_DeletingAfile {
	public static void main(String[] args) {
		File file=new File("Intel");
		if(!file.exists()) {
			file.delete();
			System.out.println("the file is deleted successfully");
		}
		else {
			System.out.println("the file is not present in project");
		}
	}

}
