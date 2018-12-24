package pack1;


//my name.... is vikas....;;;;;;sahu vikas;;;;;test;;;;case

public class Test {
	public static void main(String[] args) {
		String s = "welcome to       candid java tutorial";
		String str="";
		 
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
				
			}
		}
		//System.out.println(str);
 		System.out.println("Number of words in a string = " + count);
	}
}
