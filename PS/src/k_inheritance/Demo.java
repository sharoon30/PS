package k_inheritance;

public class Demo {
	int a=10;
	static {
		Demo d=new Demo();
		//d.a=20;
		System.out.println(d.a);
	}
	
	public static void main(String[] args) {
		A();
	}
	static void A() {
		Demo d1=new Demo();
		d1.add(8);
	}
    public void add(int a){
    	
    	System.out.println(a);
    }
	

}
