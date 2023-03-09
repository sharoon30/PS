package z_Exception_Handeling;

import java.io.File;
import java.io.IOException;

public class C4_FileHandlingException {
	public static void main(String[] args) throws IOException {
		File file=new File("pen");
		file.createNewFile();
	}

}
