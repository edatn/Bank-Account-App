package BankAccount;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts= new LinkedList<Account>();
		
		
		 String file ="C:\\Users\\EREN\\Desktop\\eda\\java project\\NewBankAccounts.csv";
		
		/*
		Checking ch1=new Checking("Tom Wilson","254875689",1250);
		Savings sv1= new Savings("Eric Doe","15487965",5250);
		
		ch1.showInfo();
		System.out.println("");
		sv1.showInfo();
	*/
     	
 //Read a csv file then create new accounts 	 
	    List<String[]> newAccountHolders =utilities.CSV.read(file);
		for (String[] accountHolder :newAccountHolders) {
			
			String name =accountHolder[0];
			String SSN =accountHolder[1];
			String accountType =accountHolder[2];
			double initDeposit =Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + SSN + " " + accountType + " " + initDeposit);
		 if(accountType.equals("Savings")) {
			 accounts.add(new Savings(name,SSN,initDeposit));
		 }
		 else if (accountType.equals("Checking")) {
			 accounts.add(new Checking(name,SSN,initDeposit));

		 }
		 else {
			 System.out.println("Eror");
		 }
		}
		for(Account acc : accounts) {
			System.out.println("***********");
			acc.showInfo();
		}
	}
}
