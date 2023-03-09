package a_class1_basic_programs;

public class M1 {
	public static void main(String[] args) {
		int k=65;
		int l=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(j%2==0) {
					System.out.print(l);
					l++;
				}else{
					System.out.print((char)k);
					k++;
				}
			}
			System.out.println();
		}
	}

}
