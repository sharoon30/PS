package z_Exception_Handeling;

public class C5_usingTryAndCatch {
	public static void main(String[] args) {
	System.out.println(1);
	try {
	System.out.println(90/0);
	
	}catch(NullPointerException e) {
		System.out.println(e);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
	}
	System.out.println(8);
	
	}
}