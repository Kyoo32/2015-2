package treemap;

import java.util.Iterator;
import java.util.TreeMap;


public class AccountManagerTreeMap {

	public TreeMap<AccountNumber, Account> accounts;
	

	public AccountManagerTreeMap() {
		accounts = new TreeMap<AccountNumber, Account>();
	}
	
	public void insertAccount(AccountNumber accountNumber, String accountName, float balance){
		Account account = new Account(accountNumber, accountName, balance);
		accounts.put(accountNumber, account);
	}
	
	public void setDeposite(String accountNumber, float money){
		
		/*
		Iterator<String> ir = accounts.keySet().iterator();
		while(ir.hasNext()){
			String tempAccount = ir.next();
			if(tempAccount.getAccountNumber().equals(accountNumber)){
				tempAccount.deposite(money);
				return;
			}			
		}
		*/
		/*
		for(int i=0; i<accounts.size() ; i++){
			Account tempAccount = accounts.get(i);
			if(tempAccount.getAccountNumber().equals(accountNumber)){
				tempAccount.deposite(money);
				return ;
			}			
		}
		
		*/
		System.out.println("There is no such account.");
		
	}
	
	public void displayAll(){
		Iterator<AccountNumber> ir=accounts.keySet().iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());		
		
		}
		
		
		System.out.println(accounts);
		/*
		for(int i=0; i<accounts.size() ; i++){
			Account tempAccount = accounts.get(i);
			System.out.println(tempAccount);		
			}	
			
		*/
		
	}
}
