package w_Encapsulation;

public class EncapD {
	public static void main(String[] args) {
		Encap e=new Encap("sharoon", 500.3);
		System.out.println(e.getName());
		double bal=e.getBalance();
		e.setName("rozario");
		System.out.println(bal);
		System.out.println(e.getName());
	}
}
