package p_method_overriding;

public class driver {
	public static void main(String[] args) {
		A1 a1=new A1();
		A3 a3=new A3();
		a3.action(a1);
		A2 a2=new A2();
		a1=a2;
		a3.action(a1);
		A2 a4=(A2)a1;
		a3.action(a4);
	}

}
