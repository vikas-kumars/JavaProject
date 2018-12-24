package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Serialize{
 public static void main(String args[])throws Exception{
  Student s1 =new Student(211,"ravi");

  FileOutputStream fout=new FileOutputStream("/home/whitewalkers/Documents/f.txt");
  ObjectOutputStream out=new ObjectOutputStream(fout);

  out.writeObject(s1);
  out.flush();

  System.out.println("success");
 }
}