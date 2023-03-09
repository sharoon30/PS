package zb_Wrapperclass;
//boxing The process of converting the  primitive value to non primitive value(object) is called as boxing
public class A3 {
	public static void main(String[] args) {
		int a=10;
		Integer b=Integer.valueOf(a);//Boxing 
		System.out.println(b);
		//AutoBoxing;
		int c=20;
		System.out.println(c);
		Integer d=c;//Auto Boxing 
		int e=d.intValue();
		Integer f=new Integer(234);
		System.out.println(f.toString());
		
		
		
		
// from jdk 1.5k there came a new update , iie autounboxing 
		
		
		
		
		
		
	}

}
