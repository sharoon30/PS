package e_arrays;
public class B5_SumOfSubArray {
	public static void main(String[] args) {
		int a[]= {5,2,-4,-5,3,-1,2,3,1};
		int max=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				sum=0;
				for(int k=i;k<=j;k++) {
					sum=sum+a[k];
				}
				if(sum>max) {
					max=sum;
				}
			}
		}
		System.out.println(max);
		
	}
}
