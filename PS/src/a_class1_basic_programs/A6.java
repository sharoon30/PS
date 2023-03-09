package a_class1_basic_programs;

public class A6 {
	public static void main(String[] args) {
		int i=1,j=0,k=0;
		for(i=1;i<=20;i++) {
			if(i%2!=0) {
				j=j+i;
			}
			else {
				k=k+i;
			}
		}System.out.println("the sum of odd is "+j);
		System.out.println("the sum of even is "+k);
	}

}
