package pack1;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		File f=new File("/home/whitewalkers/Documents/Test");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	}

}
