package o_NonPrimitiveTypeCasting;
public class Driver1 {
public static void main(String[] args) {
	Upcasting1 u1=new Upcasting1();
	Upcasting2 u2=new Upcasting2();
	u1=u2;
	Upcasting2 u3=(Upcasting2)u1;
	System.out.println(u2.b);
	System.out.println(u3.b);
	
	
	
}

}
