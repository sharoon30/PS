package l_inheritance_concept;
//inheriting from A1(superclass)
public class A2 extends A1 {
	int c=50;
	int d=60;
	public static void main(String[] args) {
		A2 a2=new A2();
		System.out.println(a2.c);
		System.out.println(a2.d);
		System.out.println(a2.a);//we can use the same reference for calling the members
		System.out.println(a2.b);
		
	}

}
