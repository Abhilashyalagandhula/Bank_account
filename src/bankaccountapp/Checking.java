package bankaccountapp;

public class Checking extends Account {

	// List properties specific to a Checking account

	private long debitCardNumber;
	private int debitCardPin;

	// constructor to initalize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setDebitCard();
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;

	}

	private void setDebitCard() {

		debitCardNumber = (long) (long) (Math.random() * 9_000_000_000_000L) + 1_000_000_000_000L;
		debitCardPin = (int) (Math.random() * 9000) + 1000;

	}

	public void showInfo() {

		super.showInfo();
		System.out.println("Your checking account features " + "\nDebitCardNumber: " + debitCardNumber
				+ "\nDebitCardPIN: " + debitCardPin);
	}

	// List any methods specific to the checking account

}
