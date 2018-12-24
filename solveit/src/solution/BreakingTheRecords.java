package solution;

import java.util.Scanner;

public class BreakingTheRecords {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number of match");
		int n=Integer.parseInt(scr.nextLine());
		int k=0;
		int[] scores=new int[n];
		System.out.println("Enter the scores");
		while(k<n) {
			scores[k]=Integer.parseInt(scr.nextLine());
			k++;
		}
		int highscore=scores[0];
		int lowscore=scores[0];
		int high=0;
		int low=0;
		for(int j=1;j<scores.length;j++) {
			if(highscore<scores[j]) {
				high++;
				highscore=scores[j];
			}
			if(lowscore>scores[j]) {
				low++;
				lowscore=scores[j];
			}
		}
		System.out.println("highscore: "+highscore+" lowScore: "+lowscore);
		System.out.println(high+"="+low);
		/*int array[]= {high,low};
		return array;*/
	}

}

/*Enter the number of match= 9
Enter the scores=10,5,20,20,4,5,2,25,1
Output:-highscore: 1 lowScore: 25
4=2*/
