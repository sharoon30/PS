package practiceBlock;

public class B1 {
	void add() {
		System.out.println(sub(19));
		System.out.println("add 1");
	}
	int sub(int a) {
		mul();
		return a;
	}
	static void mul() {
		
			System.out.println("mul");
	}
	public static void main(String[] args) {
		B1 b1=new B1();
		b1.add();
	}
	

}
