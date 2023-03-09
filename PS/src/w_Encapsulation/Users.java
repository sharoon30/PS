package w_Encapsulation;

public class Users {
	public static void main(String[] args) {
		Bank b1=new Bank();
		System.out.println(b1.getBalance());
		b1.setBalance(100);
		System.out.println(b1.getBalance());
		b1.setBalance(1000);
		System.out.println(b1.getBalance());
	}

}
