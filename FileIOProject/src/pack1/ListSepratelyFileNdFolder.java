package pack1;

import java.io.File;

public class ListSepratelyFileNdFolder {

	public static void main(String[] args) {
		file();
		directory();
	}

	private static void directory() {
		int count=0;
		File f=new File("/home/whitewalkers/Documents");
		String[] str=f.list();
		System.out.println("Name of Directory present: ");
		for(String s:str){
			File f1=new File(f,s);
			if(f1.isDirectory()) {
				count++;
				System.out.println(s);
			}
		}
		System.out.println("Number of Directory: "+count);
	}

	private static void file() {
		int count=0;
		File f=new File("/home/whitewalkers/Documents");
		String[] str=f.list();
		System.out.println("Name of File present: ");
		for(String s:str){
			File f1=new File(f,s);
			if(f1.isFile()) {
				count++;
				System.out.println(s);
			}
		}
		System.out.println("Number of File: "+count);
	}
}
