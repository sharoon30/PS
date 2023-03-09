package a_class1_basic_programs;

public class Amazon {
static void cart() throws ProductException{
	int amount=999;
	if(amount>999) {
		System.out.println("Apply coupon");
	}
	else {
		throw new ProductException("add more product to cart");
	}
}
public static void main(String[] args) {
	try {
		cart();
	}
	catch(ProductException p) {
		System.out.println(p.getmsg());
	}
}
}
