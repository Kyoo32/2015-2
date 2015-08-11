package hash;

public class Account {
	private String accountNumber;
	private String accountName;
	private float balance;
	
	public Account(){}
	public Account(String accountNumber, String accountName, float balance){
		this.accountNumber = accountNumber;
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
	
	
	@Override
	public int hashCode() {
		//return Float.parseFloat(accountNumber);
		return accountNumber.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account){
			Account account = (Account) obj;
			if(this.accountNumber.equals(account.getAccountNumber())) return true;
		}
		return false;
	}
	public String toString(){
		return accountName + "님의 계좌번호는 " + accountNumber + "이며, 잔고는 " + balance + "입니다.";
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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
	
	
	
}
