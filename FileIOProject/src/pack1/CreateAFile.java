package pack1;

import java.io.File;
import java.io.IOException;

public class CreateAFile {

	public static void main(String[] args) throws IOException {
		// just provide reference to file if exist
		File f=new File("/home/whitewalkers/Documents/abc.txt");
		System.out.println(f.exists());// if exist return true else false
		f.createNewFile();// create a new file refernced to object
		System.out.println(f.exists());
	}

}
