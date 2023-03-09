package k_inheritance;

public class A13_prime {
	public static void main(String[] args) {
		int i,j;
		for(i=2;i<20;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					System.out.println(i+" it is not a prime");
				}
				else {
					System.out.println(i+" it is a prime");
				}
			}
		}
	}

}
