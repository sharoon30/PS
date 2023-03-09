package a_class1_basic_programs;

public class Logical_and_or {
	public static void main(String[] args) {
		int a=10,b=11;
		System.out.print(a==10&&b==11);
		System.out.print(a<b&&b==11);
		System.out.print(a++>b&&++b>a);
		System.out.print(a<++b&&--a<b);
		System.out.print(a);
		System.out.print(b);
		System.out.println();
		int i=12,j=13;
		int k=j--;
		System.out.println(k);
		System.out.println(j);
	}
	

}
