package Assignement;

public class P {
	public static void main(String[] args) {
	int number=8;
	//boolean  b=true;
	for(int i=1;i<=10;i++) {
		boolean b=true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				b=false;
				break;
			}
		}
		if(b==true) {
			System.out.println("prime"+i);
		}else {
			System.out.println("not prime"+i);
		}
		
	}
	
	
	
	}
}
