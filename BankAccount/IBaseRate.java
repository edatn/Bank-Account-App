package BankAccount;

public interface IBaseRate {

	//write a method that returns 
	 default double getBaseRate() {
		 return 2.5;
	 }
}
