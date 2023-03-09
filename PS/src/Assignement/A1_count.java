package Assignement;

public class A1_count {
	public static void main(String[] args) {
		String s="aabbccddeee";
		int count=0;
		int m=0,n=0,o=0,p=0;
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a') {
				m++;
			//	System.out.println("a:"+m);
			}
			else if(c[i]=='b') {
				n++;
			//	System.out.println();
			}
			else if(c[i]=='c') {
				o++;
			}
			else if(c[i]=='d') {
				p++;
			}
			else {
				count++;
			}
		}
		System.out.println("the number of a is :"+m);

		System.out.println("the number of b is :"+n);

		System.out.println("the number of c is :"+o);

		System.out.println("the number of d is :"+p);
		

		System.out.println("the number of e is :"+count);
	}

}
