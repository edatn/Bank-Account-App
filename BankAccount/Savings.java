package BankAccount;

public class Savings extends Account{

	    //properties to a Savings account
	    private int safetyDepositBoxID;
	    private int safetyDepositBoxKey;
	
	
		//Constructor to intialize Savings account 
		public Savings (String name,String SSN, double initDeposit) {
			super(name,SSN,initDeposit);
			accountNumber="1"+ accountNumber;
			setSafetyDepositBox();		
		}
	    @Override
		public void setRate() {
			rate=getBaseRate() - .25;
		}
		
		private void  setSafetyDepositBox() {
			 safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
			 safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));

		}
		
		//List any methods specific to the Savings account
		public void showInfo() {
			super.showInfo();
			System.out.println("Savings account fields");
			System.out.println("safety deposit box ID: "+ safetyDepositBoxID);
			System.out.println("safety deposit box Key: "+ safetyDepositBoxKey);

		}
}
