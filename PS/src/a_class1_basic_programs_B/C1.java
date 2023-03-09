package a_class1_basic_programs_B;

public class C1 {
	public static void main(String[] args) {
		int a[]= {1,2,13,20};
		for(int j=0;j<=10;j++) {
		int number=j;
		boolean key=false;
		for(int i=0;i<a.length;i++) {
			if(number==a[i]) {
			key=true;
			break;
			}
		}
		if(key==false) {
			System.out.println(number);
		}
	}
	}
}
