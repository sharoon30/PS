package a_class1_basic_programs;

public class Operators {
	public static void main(String[] args) {
		int i=5;
		int j=7;
		int k=i+j;//+ is the operator
		System.out.println(k);
		//pre and post increment ;
		System.out.println(k++ + ++k);
		int a=10,c=a++,d=++a,b=11,e=b++,f=++b;
		System.out.println(++c + ++d + e++ + ++f);
		// example for ternary operator;
		int x=10,y=3;
		int w=(x<y)?x:y;//if the condition is true it w
		System.out.println(w);
	}
	

}