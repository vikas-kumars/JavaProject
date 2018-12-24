package pack1;

public class MyExplicitThrow {

	public static void main(String[] args) {
		MyExplicitThrow met=new MyExplicitThrow();
		try {
			System.out.println("length of JUNK is "+met.getStringSize("JUNK"));
			System.out.println("length of WRONG is "+met.getStringSize("WRONG"));
			System.out.println("length of null string is "+met.getStringSize(null));
		}catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

	private int getStringSize(String string)throws Exception {
		if(string==null) {
			throw new Exception("String Input is null");
		}
		return string.length();
	}

}
