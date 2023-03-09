package a_class1_basic_programs;
//program to print sum of even last digit from the range 45 to 57 using for loop
public class Evenlastdigit {
	public static void main(String[] args) {
		int i,j=0,k=0;
		for (i=45;i<=57;i++) {
			if(i%2==0) {
				j=i%10;
				k=k+j;
				
				
			}
		}System.out.println(k);
	}

}
