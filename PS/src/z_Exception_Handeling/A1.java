package z_Exception_Handeling;

public class A1{
	public static void main(String[] args) {
		add();
	}
	static void add() {
		sub();
	}
	static void sub() {
		int a=10,b=0,c;
		c=a/b;
		System.out.println(c);
	}

}
