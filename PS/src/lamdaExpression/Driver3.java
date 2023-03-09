package lamdaExpression;
//--->When in the case of return type we have to provide the value inside the lamda expression itself
//--->After JDK 15 we can pass the parameter along with the return type

public class Driver3 {
	public static void main(String[] args) {
		C1 c1=(a,b)->{
			return a+(int)b;
		};
		System.out.println(c1.mul(10, 20.2));
	}

	
}
