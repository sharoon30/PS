package lamdaExpression;
//-->Introduced in JDK 1.8
//-->Internal Upcasting will be done by using Lamda exp
//-->When there is parameter inside a method in Interface 
//Then we have to pass a character not a value ;

public class Driver2 {
	public static void main(String[] args) {
		B1 b1=(a)->{
			System.out.println("substraction");
		};
		b1.sub(92);
	}

}
