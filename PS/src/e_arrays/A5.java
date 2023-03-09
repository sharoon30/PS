package e_arrays;
//to find the largest number present in an array
public class A5 {
	public static void main(String[] args) {
		int a[]= {5,96,75,80,615,3};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
