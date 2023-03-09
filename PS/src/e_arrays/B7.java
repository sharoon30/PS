package e_arrays;

public class B7 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,5,6,7};
		int o[]=B6_RunningSum.runningSum(a);
		for(int i=0;i<o.length;i++) {
			System.out.print(o[i]+" ");
		}
	}

}
