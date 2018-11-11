package java2nvoice;

public class StringRecursiveReversal {
	String reverse="";
	public  String stringReverse(String str) {
		if(str.length()==1) {
			return str;
		}
		else {
			reverse=str.charAt(str.length()-1)+stringReverse(str.substring(0, str.length()-1));
			return reverse;
		}
	}
	public static void main(String[] args) {
		StringRecursiveReversal srr=new StringRecursiveReversal();
		System.out.println("revese :"+srr.stringReverse("Java2nvoice"));
	}
}
