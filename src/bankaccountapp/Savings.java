package bankaccountapp;

public class Savings extends Account {

	// list proprties speicific to the savings account

	private int safetyDepositeBoxID;
	private int safetyDepositeBoxKey;

	// constructor to initailize settings for the saving properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;

		setSafetyDepositeBox();
	}

	private void setSafetyDepositeBox() {

		safetyDepositeBoxID = (int) (Math.random() * 900) + 100;
		safetyDepositeBoxKey = (int) (Math.random() * 9000) + 1000;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("your saving Account Features" + "\n SafetyDepositeBoxID: " + safetyDepositeBoxID
				+ "\n SafetyDeposteBoxKey: " + safetyDepositeBoxKey);

	}
	// list ant method specific to the saving account

	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;

	}

}
