package java2nvoice;

/*import java.util.Scanner;

class PrimeNumber{
	public static void main(String[] args){
		int n,m=0,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		m=n/2;
		if(n==0 || n==1){
			System.out.println(n+"= is not prime number");
		}else{
			for(int i=2;i<=m;i++){
				if(n%i==0){
					System.out.println(n+"= is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(n+"= is prime number");
				}
		}
	}
}*/
import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args) {
		boolean b=true;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		if(n==0 ||n==1) {
			System.out.println(n+" is not a prime number");
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println(n+" is not a prime number");
					b=false;
					break;
				}
			}
			if(b==true) {
				System.out.println(n+" is a prime number");
			}
		}
	}
}