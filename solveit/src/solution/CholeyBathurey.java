package solution;

public class CholeyBathurey {

	public static void main(String[] args) {
		int array[]= {8,7,9,6,4,10,2,10};
		int count=100;
		int a=0;
		int len=array.length;
		System.out.print(count+" ");
		for(int i=0;i<len;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		count=count-array[0];
		System.out.print(count+" ");
		for(int i=0;i<len-1;i++) {
			array[i]=array[i+1];
			System.out.print(array[i]+" ");
		}
		len--;
		System.out.println();
		for(int i=0;i<len;i++) {
			if(count>50) {
				if(array[i]>=5) {
					count=count-5;
					a=array[i]-5;
					System.out.print(count+" ");
					for(int j=0;j<=len-1;j++) {
						array[j]=array[j+1];
						//array[len-1]=a;
						//System.out.print(array[j]+" ");
					}
					array[len-1]=a;
					for(int k=0;k<len;k++) {
						System.out.print(array[k]+" ");
					}
					//len--;
					i--;
					System.out.println();
				}else {
					count =count-array[i];
					System.out.print(count+" ");
					for(int j=0;j<=len-1;j++) {
						array[j]=array[j+1];
						//System.out.print(array[j]+" ");
					}
					len--;
					i--;
					for(int k=0;k<len;k++) {
						System.out.print(array[k]+" ");
					}
					System.out.println();
				}
			}else {
				if(array[i]>=3) {
					count=count-3;
					a=array[i]-3;
					System.out.print(count+" ");
					for(int j=0;j<=len-1;j++) {
						array[j]=array[j+1];
						//array[len-1]=a;
						//System.out.print(array[j]+" ");
					}
					array[len-1]=a;
					for(int k=0;k<len;k++) {
						System.out.print(array[k]+" ");
					}
					//len--;
					i--;
					System.out.println();
				}else {
					count =count-array[i];
					System.out.print(count+" ");
					for(int j=0;j<=len-1;j++) {
						array[j]=array[j+1];
						//System.out.print(array[j]+" ");
					}
					len--;
					i--;
					for(int k=0;k<len;k++) {
						System.out.print(array[k]+" ");
					}
					System.out.println();
				}
				
			}
		}
	}

}
