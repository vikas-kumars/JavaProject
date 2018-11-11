package java2nvoice;

public class Pattern2 {
	public static void main(String[] args) {
		char last = 'E', alphabet = 'A';

	     for(int i = 1; i <= (last-'A'+1); ++i) {
	         for(int j = 1; j <= i; ++j) {
	             System.out.print(alphabet + " ");
	         }
	         ++alphabet;

	         System.out.println();
	     }
		
		
		
		/*int rows = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        } */
		
		
	}
	 

}
