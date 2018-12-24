package pack1;

import java.io.File;
import java.io.IOException;

public class CreateFolderNdFile {

	public static void main(String[] args) throws IOException {
		File f=new File("/home/whitewalkers/Documents/Sample");
		f.mkdir();
		//File f1=new File("/home/whitewalkers/Documents/Sample","Sample.txt");
		File f1=new File(f,"Sample.txt");
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.exists());
		
	}

}
