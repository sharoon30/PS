package e_arrays;
import java.util.Scanner;
public class B3_primeStoring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int n=sc.nextInt();
		int b[]=prime(n);
		int until=n;
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
		}
	}
	public static int[] prime(int n){
		int size=n*5;
		
		int a[]=new int[size];
		boolean flag;
		int k=0;
		for(int i=1;i<a.length;i++) {
			flag=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				a[k]=i;
				k++;
			}
			
		}
		return a;
	}
}
