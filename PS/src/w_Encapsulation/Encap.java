package w_Encapsulation;

public class Encap {
	private String name;
	private double balance;
	Encap(String name,double balance){
		this.name=name;
		this.balance=balance;
	}
	public String getName() {
		return name ;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	

}
