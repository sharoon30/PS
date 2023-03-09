package e_arrays;

import java.util.ArrayList;

public class B6_RunningSum {
	
	public static void main(String[] args) {
	int a[]= {1,2,3,4};
	
	int output[]=runningSum(a);
	for(int i=0;i<output.length;i++) {
		System.out.print(output[i]+" ");
	}
	}
	public static int[] runningSum(int a[]) {
		int sum=0;
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			sum=0;
			for(int j=0;j<=i;j++) {
				sum=sum+a[j];
			}
			b[i]=sum;	
		}
		return b;
	}
}
