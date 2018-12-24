package pack1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequency {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String str=scr.nextLine();
		str=str.replace(".", " ");
		str=str.replace(",", " ");
		str=str.replace(";", " ");
		str=str.replace("  "," ");
		str=str.toLowerCase();
		String[] wordArray=str.split("\\s+");
		Map<String,Integer> m=new TreeMap<String,Integer>();
		for(String s:wordArray) {
			if(m.containsKey(s)) {
				m.put(s, m.get(s)+1);
			}else {
				m.put(s, 1);
			}
			//System.out.println(s);
		}
		for(Map.Entry<String, Integer> entry: m.entrySet()) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		
		
	}

}
