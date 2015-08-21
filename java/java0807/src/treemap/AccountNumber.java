package treemap;

public class AccountNumber implements Comparable<AccountNumber> {

	String accountNumber;
	
	

	public AccountNumber(String string) {
		accountNumber = string;
	}

	

	@Override
	public int compareTo(AccountNumber acc) {
		// TODO Auto-generated method stub
		return this.accountNumber.compareTo(acc.accountNumber) * (-1);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return accountNumber;
	}
	
	
	
	
}
	