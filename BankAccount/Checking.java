package BankAccount;

public class Checking extends Account {
  
	//properties to a Checking account
	private int DebitCardNumber;
	private int DebitCardPIN;
	
	//Constructor
	public Checking(String name,String SSN, double initDeposit) {
		super(name,SSN,initDeposit);
		accountNumber="2" + accountNumber;
	    setDebitCard();
	}
    @Override
	public void setRate() {
		rate=getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		DebitCardNumber=(int)(Math.random() *Math.pow(10, 12));
		DebitCardPIN=(int)(Math.random() *Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Checking account fields");
		System.out.println("debit Card Number: "+ DebitCardNumber);
		System.out.println("debit Card PIN: "+ DebitCardPIN);

	}
	
}

