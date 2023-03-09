package zb_Wrapperclass;

public class AutoBoxing {
	public static void main(String[] args) {
		int a=10;
		Integer b=a;//autoBoxing
		System.out.println(b.toString());//only with the help of object ref it is possible to call a method
	                                    // so this is the proof that it has autoboxed 
	}

}
