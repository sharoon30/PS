package e_arrays;
//write a program to design a method which can accept an integer array and return sum of all number in array 
public class A4 {
	public static void main(String[] args) {
		A4 a4=new A4();
	 int a[]= {1,2,3,4,5};
	 int s=a4.add(a);
	 System.out.println(s);
	 int b[]= {2,3,4,5,6,7};
	 int t=a4.add(b);
	 System.out.println(t);
	}
	public int add(int a[]) {
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		
		}
		return sum;
		
	}

}
