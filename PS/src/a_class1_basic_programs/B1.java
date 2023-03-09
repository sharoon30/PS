package a_class1_basic_programs;

public class B1 {
	public static void main(String[] args) {
		int number=2;
		int i=1;
		boolean key=true;
		while(i<number) {
			 key=true;
			if(number%2==0) {
				key=false;
				break;
			}
			i++;
		}
		if(key==true) {
			System.out.println(number+" It is a Prime Number");
		}else {
			System.out.println("it is not a prime number ");
		}
	}
}
