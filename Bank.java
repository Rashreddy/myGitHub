package accounts;

public interface Bank {
//	String accountName="Rashmith";
//	int depAmount,withdrawAmount,transferAmount;
	
	
	public void openAccount(String name);
	
	public void deposit(int amount);
	
	public void withdraw(int amount);
	
	public void transferMoney(int amount);
	
	public void closeAccount(int amount);
	
	

}
