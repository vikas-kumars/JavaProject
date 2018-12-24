package pack1;

import java.io.File;

public class ListOfFileNdFolder {

	public static void main(String[] args) {
		File f=new File("/home/whitewalkers/Documents");
		String[] str=f.list();
		for(String s: str) {
			System.out.println(s);
		}
	}

}
