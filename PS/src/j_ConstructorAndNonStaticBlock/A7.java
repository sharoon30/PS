package j_ConstructorAndNonStaticBlock;

public class A7 {
int a=10;
public static void main(String[] args) {
	A7 a2=new A7();
	a2.a1();
	A7 a1=new A7();
	System.out.println(a1.a);
}
public void a1() {
     a=20;
     System.out.println(a);
}
}
