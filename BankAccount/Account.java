package BankAccount;

public abstract class Account implements IBaseRate{

	//properties for savings and checking 
	   private String name;
	   private String SSN;
	   private double balance;
	   
	   static int index=10000;
	   protected String accountNumber;
	   protected double rate;
	   

	//Constructor 
	 public Account(String name,String SSN, double initDeposit) {
		 this.name=name;
		 this.SSN=SSN;
		 this.balance=initDeposit;
		 this.accountNumber=setAccountNumber();
		 setRate();
	 }
	 public abstract void setRate();
	 
	  private String  setAccountNumber() {
		  String lastTwofSSN=SSN.substring(SSN.length()-2,SSN.length());
	      int uniqueID= index;
	      int randomNumber=(int)(Math.random() * Math.pow(10, 3));
	      return lastTwofSSN + uniqueID + randomNumber;
	        }
	  
	  public void compound() {
		  double accruedInterest = balance * (rate/100);
		  System.out.println("accrued Interest : $" + accruedInterest);
	  }
	  
	  //List common
	   public void deposit(double amount) {
		   balance= balance + amount ;
		   System.out.println("deposit $:" + amount);
		   printBalance();
	   }
	  public void withdraw(double amount) {
		  balance= balance - amount;
		  System.out.println("withdrawing $ "+ amount);
	      printBalance();
	  }
	  public void transfer(String toWhere,double amount) {
		  balance = balance - amount;
		  System.out.println("tansefer: $" + amount + "to" + toWhere);
		  printBalance();
	  }
	  public void printBalance() {
		  System.out.println("your balance is now: $ " + balance);
	  }
	  
	 public void showInfo() {
		 System.out.println("Name:" + name);
		 System.out.println("Account number: " + accountNumber);
	     System.out.println("Balance: " + balance);	 
	     System.out.println("Rate: " + rate + "%");
	 }
}
	
	

