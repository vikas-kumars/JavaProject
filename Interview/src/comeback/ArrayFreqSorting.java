package comeback;

public class ArrayFreqSorting {
	static int x=0;

	public static void main(String[] args) {
		int a[]= {4,3,1,6,4,3,6,4};
		int c[][]=new int[a.length][2];
		a=sort(a);
		/*for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" "); //1 3 3 4 4 4 6 6 
		}*/
		c[x][0]=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]==a[i-1]) {
				c[x][1]=c[x][1]+1;
			}
			else {
				x++;
				c[x][0]=a[i];
			}
		}
		x++;
		c=sort(c);
		for(int i=0;i<x;i++) {
			for(int j=0;j<=c[i][1];j++) {
				System.out.print(" "+c[i][0]);
			}
			//System.out.println();
		}
		
	}
	public static int[][] sort(int c[][]){
		int d[]=new int[2];
		for(int i=0;i<x;i++) {
			for(int j=i;j<x;j++) {
				if(c[i][1]<c[j][1]) {
					d=c[i];
					c[i]=c[j];
					c[j]=d;
					  }
			}
		}
		return c;
	}
	public static int[] sort(int b[]) {
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					int t=b[i];
					b[i]=b[j];
					b[j]=t;
				}
				
			}
		
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		return b;
		
	}

}
