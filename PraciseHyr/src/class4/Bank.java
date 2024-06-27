package class4;

public class Bank {
	static int currentBalance = 1000;
	public static void greetCustomer() {
		System.out.println("Hello Wellcome to the banking application");	
	}
	
	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Amount deposited successfully");
	}
	public static void withdrawl(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount withdrawl successfully");

	}
	public int getCurrentBalance() {
		return currentBalance;

	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		greetCustomer();
		System.out.println("Current balance is : " + bank.getCurrentBalance());
		bank.deposit(500);
		System.out.println("Current balance is : " + bank.getCurrentBalance());
		withdrawl(300);
		System.out.println("Current balance is : " + bank.getCurrentBalance());
		withdrawl(100);
		System.out.println("Current balance is : " + bank.getCurrentBalance());

	}

}
