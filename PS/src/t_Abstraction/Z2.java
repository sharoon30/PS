package t_Abstraction;

public class Z2 extends Z1 {
int a=40;
public static void main(String[] args) {
	Z1 z1=new Z1();
	Z2 z2=new Z2();
	z1=z2;
	System.out.println(z1.a);
	z1.add();
}
void add() {
	System.out.println("method 2");
}
}
