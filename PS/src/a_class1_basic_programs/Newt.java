package a_class1_basic_programs;

public class Newt {
	public static void main(String[] args) {
		String s="true";
		boolean b=Boolean.parseBoolean(s);
		if(b) {
			System.out.println("it is executed");
		}else {
			System.out.println("false");
		}
		System.out.println(b);
	}

}
