package b_type_casting;
//performing narrowing and widening 
public class N2 {
	public static void main(String[] args) {
		long a=10;
		double b=a;
		System.out.println(a);
		System.out.println(b);
		 int c=(int)b;
		 System.out.println(c);
		 float d=c;
		 int e=(int)d;
		 System.out.println(e);
	}

}
