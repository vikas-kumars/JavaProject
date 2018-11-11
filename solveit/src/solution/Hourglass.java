package solution;

import java.util.Scanner;

public class Hourglass {

	/*public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[][] arr=new int[6][6];
		for(int i=0;i<6;i++) {
			String[] arrRowItems=s.nextLine().split(" ");
			for(int j=0;j<6;j++) {
				int arrItem=Integer.parseInt(arrRowItems[j]);
				arr[i][j]=arrItem;
			}
		}
		int k=0;
		for(int i=0;i<=k+2;i++) {
			for(int j=0;j<=k+2;j++) {
				if(i<3 ||j<3) {
					System.out.print(arr[i][j]);
				}else {
					System.out.print(" ");
				}				
			}
			System.out.println();
			//k++;
		}
	}*/
	 public static void main(String[] args) 
	    {
	        
			Scanner stdIn = new Scanner(System.in);
			
			int rows = 6;				
			int cols = 6;				
			int minValueInArray = -9;	
			int elementsInHourGlass = 7;
			
			int maxHourGlassSum = minValueInArray * elementsInHourGlass;
			
			int matrix[][] = new int[rows][cols];
			int hourGlassSum;	
			
			
	        for(int i=0; i < rows; i++)
	        {
	        	
	            for(int j=0; j < cols; j++)
	            {
	            	
	                matrix[i][j] = stdIn.nextInt();
	            }
	        }
	        
	        for(int i=0; i < rows; i++)
	        {
	            for(int j=0; j < cols; j++)
	            {
	                //System.out.print(matrix[i][j] + " ");
	            }
	        }
	        
	        for (int i=0; i < (rows-2); i++) 
	        {
	        	for (int j=0; j<(cols-2); j++)
	        	{
	        		
	        		hourGlassSum = matrix[i][j]   + matrix[i][j+1]   + matrix[i][j+2] +
	        									    matrix[i+1][j+1] +
	        					   matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
	        		
	        		if (hourGlassSum > maxHourGlassSum) 
	        		{
	        			
	        			maxHourGlassSum = hourGlassSum;
	        		}
	        	}
	        }
	       
	        System.out.println( maxHourGlassSum);

	    }
	}		

