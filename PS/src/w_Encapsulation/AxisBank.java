package w_Encapsulation;

import java.util.Scanner;

public class AxisBank {
  private  int Account_number;
   private int balance;
   int password;
public AxisBank(int account_number, int balance,int password) {
	super();
	Account_number = account_number;
	this.balance = balance;
	this.password=password;
}
Scanner sc=new Scanner(System.in);
public void setAccount_number(int account_number) {
	Account_number = account_number;
}
public int getBalance() {
	System.out.println("enter the account number");
	int ac=sc.nextInt();
	System.out.println("enter the password");
	int psw=sc.nextInt();	
	if(Account_number==ac && password==psw) {
	return balance;
}
	else {
		return 0;
	}
}
	
	
public void setBalance(int balance) {
	this.balance = balance;
}
    

}
