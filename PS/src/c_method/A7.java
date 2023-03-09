package c_method;
//create one parameterised method and it should return the fcat of parameter
public class A7 {
	public static void main(String[] args) {
		A7 a7=new A7();
		int m=a7.fact(4);
		System.out.println(m);
	}
	public int fact(int a) {
		int f=1;
		for(int i=a;i>=1;i--) {
			f=f*i;
		}
		return f;
	}

}
