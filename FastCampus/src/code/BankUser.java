package code;

public class BankUser {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		int customerMoney = bank.checkCustomerMoney();
		System.out.println(customerMoney);
		
		
	}

}
