package Assignement;

public class Fibo {
	public static void main(String[] args) {
		int key=5;
		int a=0;
		int b=1,c;
		for(int i=0;i<key;i++) {
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}
	}

}
