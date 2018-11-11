package solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,String> m=new HashMap<String, String>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            m.put(name, Integer.toString(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            if(m.containsKey(s)){
            	System.out.println(s+"="+m.get(s));
            }
            else 
            {
            	System.out.println("Not Found");
            }
      }
	}

}
