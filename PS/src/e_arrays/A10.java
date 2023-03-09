package e_arrays;
// create a method and find the smallest number present int the array, and create an array using declaration and initialisation
public class A10 {
	public static void main(String[] args) {
		A10 a1=new A10();
		int a[]= {10,20,66,88,44,77,5};
		a1.minimum(a);
		int b[]= {55,66,77};
		a1.minimum(b);
		
	}
	public void minimum(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
