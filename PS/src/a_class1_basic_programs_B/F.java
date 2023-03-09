package a_class1_basic_programs_B;

public class F {
	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40;
		if(a>b&&a>c&&a>d) {
			System.out.println("a is greater ");
		}
		else if (b>a&&b>c&&b>d) {
			System.out.println("b is greater");
		}
		else if (c>a&&c>b&&c>d) {
			System.out.println("c is greater");
		}
		else if (d>a&&d>b&&d>c) {
			System.out.println("d is greater ");
		}
	}

}
