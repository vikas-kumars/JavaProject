package solution;

import java.util.Scanner;

public class ExceptionBasic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          String S = in.next();
          try {               
          int n=Integer.parseInt(S);
              System.out.println(n);
         }catch(NumberFormatException e){
              System.out.println("Bad String"); 
          }
      }
}
