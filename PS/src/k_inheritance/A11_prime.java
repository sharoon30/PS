package k_inheritance;

public class A11_prime {
	public static void main(String[] args) {
		int i,j;boolean key;
		for(i=2;i<=10;i++)
		{
			key=true;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					key=false;
				}
			}
			if(key==true) {
				System.out.println(j+" it is prime");
			}
		}
	}

}
