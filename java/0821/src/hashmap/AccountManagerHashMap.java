package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class AccountManagerHashMap {

	public HashMap<String, Account> accounts;
	
	public AccountManagerHashMap(){
		this(10);
	}

	public AccountManagerHashMap(int size) {
		accounts = new HashMap<String, Account>(size);
	}
	
	public void insertAccount(String accountNumber, String accountName, float balance){
		Account account = new Account(accountNumber, accountName, balance);
		accounts.put(accountNumber, account);
	}
	
	public void setDeposite(String accountNumber, float money){
		
		if( accounts.containsKey(accountNumber)) {
			Account account = accounts.get(accountNumber);
			account.deposite(money);
			return;
		}
			System.out.println("There is no account.");

		
		
		
		/*
		
		Iterator<String> ir = accounts.keySet().iterator();
		while(ir.hasNext()){
			String tempAccount = ir.next();
			if(tempAccount.getAccountNumber().equals(accountNumber)){
				tempAccount.deposite(money);
				return ;
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
		
		
		System.out.println("There is no such account.");
		
		*/
	}
	
	public void displayAll(){
		Iterator<String> ir=accounts.keySet().iterator();
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
