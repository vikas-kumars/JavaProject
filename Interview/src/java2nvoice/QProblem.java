package java2nvoice;

import java.util.*;

public class QProblem{

public static StringBuilder removechar(String string,Character element){

char[] arr = string.toCharArray();

//blah blah,i used one string function,so what?

ArrayList<Character> arrlist = new ArrayList<Character>();

for(int i = 0;i<=string.length()-1;i++){

arrlist.add(((Character)arr[i]));

}

for(int j = 0;j<=arrlist.size()-1;j++){

if(arrlist.get(j).equals(element)){

arrlist.remove(j);

//remove here is an arraylist function

}

}

StringBuilder result = new StringBuilder(arrlist.size());

//StringBuilder is not a function,so shut ur trap

for(Character k:arrlist){

result.append(k);

}

return result;

}
}