package bankaccountapp;

public abstract class Account implements IRate {
//list common properties for saving and checking accounts

	private String name;
	private String sSN;
	private double balance;
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;

	// constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}

	public abstract void setRate();

	// set account number

	private String setAccountNumber() {

		String lastTwoOfsSN = sSN.substring(sSN.length() - 2);
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * 1000) + 100;
		return lastTwoOfsSN + uniqueID + randomNumber;

	}

	public void compund() {

		double accruedIntrest = balance * (rate / 100);
		balance += accruedIntrest;
		System.out.println("Account Interest rs:" + accruedIntrest);
		printBal();
	}

	// list common methods transactions

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdrawl(double amount) {

		balance -= amount;
	}

	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("transfering rs: " + amount + " to " + toWhere);

	}

	public void printBal() {
		System.out.println("your balance is rs: " + balance);
	}

	public void showInfo() {

		System.out.println("Name: " + name + "\nAccountNumber: " + accountNumber + "\nBALANCE: " + balance + "\nRate:"
				+ rate + "%");

	}
}
