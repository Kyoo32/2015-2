package treemap;

import java.util.Comparator;

public class Account implements Comparator<Account> {
	private AccountNumber accountNumber;
	private String accountName;
	private float balance;
	
	public Account(){}
	public Account(AccountNumber accountNumber2, String accountName, float balance){
		this.accountNumber = accountNumber2;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public void deposite(float money){
		//defense code is necessary
		if( money <= 0 ){
			System.out.println("Error");
		}
		balance += money;
	}
	
	public void withdraw(float money){
		if(balance < money){
			System.out.println("Error");
			return;
		}
		
		balance -= money;
	}
	
	public String toString(){
		return accountName + "님의 계좌번호는 " + accountNumber + "이며, 잔고는 " + balance + "입니다.";
	}
	
	public AccountNumber getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
//	@Override
//	public int compareTo(Account acc) {
//	//	int tempbalance1 = (int)acc.getBalance();
//	// int tempbalance2 = (int)this.getBalance();
//		
//		return this.getAccountNumber().compareTo(acc.getAccountNumber()) * (-1);
//		
//		//return tempbalance1 - tempbalance2;
//	}
	@Override
	public int compare(Account o1, Account o2) {
		return  o1.getAccountNumber().compareTo(o2.getAccountNumber());
	
	}
	
	
	
}
