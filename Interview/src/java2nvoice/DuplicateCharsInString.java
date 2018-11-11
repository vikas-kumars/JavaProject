package java2nvoice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharsInString {

	/* public void findDuplicateChars(String str){

        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        //System.out.println(dupMap);
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }

    public static void main(String a[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars("Java2Novice");
    }*/
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String str=scr.nextLine();
		char ch[]=str.toCharArray();
		 Map<Character, Integer> dupmap = new HashMap<Character, Integer>(); 
		for(Character chr:ch) {
			if(dupmap.containsKey(chr)) {
				dupmap.put(chr, dupmap.get(chr)+1);
			}else {
				dupmap.put(chr, 1);
			}
		}
		System.out.println(dupmap);
		Set<Character> keys=dupmap.keySet();
		for(Character c:keys) {
		if(dupmap.get(c)>1) {
			System.out.println(c+"---->"+dupmap.get(c));
			
		}
		}
		
	}
}