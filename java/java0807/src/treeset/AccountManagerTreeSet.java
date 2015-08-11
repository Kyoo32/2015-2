package treeset;

import java.util.TreeSet;
import java.util.Iterator;


public class AccountManagerTreeSet {

	public TreeSet<Account> accounts;
	

	public AccountManagerTreeSet() {
		accounts = new TreeSet<Account>();
	}
	
	public void insertAccount(String accountNumber, String accountName, float balance){
		Account account = new Account(accountNumber, accountName, balance);
		accounts.add(account);
	}
	
	public void setDeposite(String accountNumber, float money){
		
		
		Iterator<Account> ir = accounts.iterator();
		while(ir.hasNext()){
			Account tempAccount = ir.next();
			if(tempAccount.getAccountNumber().equals(accountNumber)){
				tempAccount.deposite(money);
				return ;
			}			
		}
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
		Iterator<Account> ir=accounts.iterator();
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
