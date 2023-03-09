package a1_interviewPrograms;

public class B6_SplitAndAdd {
	public static void main(String[] args) {
		int a=1661;
		int b=0,c,d;
		while(a>0) {
			c=a%10;
			b=b+c;
			a=a/10;
		}
		System.out.println(b);
		
	}

}
