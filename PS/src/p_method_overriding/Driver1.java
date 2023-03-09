package p_method_overriding;

public class Driver1 {
	public static void main(String[] args) {
		Car c1=new Car();
		W w1=new W();
		w1.Wheels(c1);
		Bike b1=new Bike();
		c1=b1;
		Bike b2=(Bike)c1;
		w1.Wheels(b2);
		Auto a1=new Auto();
		c1=a1;
		Auto a2=(Auto)c1;
		w1.Wheels(a2);
	}

}
