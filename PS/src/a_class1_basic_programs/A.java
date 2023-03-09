package a_class1_basic_programs;
public class A {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int k=i;
			for(int j=1;j<=5;j++) {
				if(j%2==1) {
					System.out.print(k+" ");
					k+=10;
				}
				else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
	}
}