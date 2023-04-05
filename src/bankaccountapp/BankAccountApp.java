package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {

		List<Account> accounts = new LinkedList<Account>();

		String file = "C:\\Users\\abhil\\Downloads\\NewBankAccounts.csv";

//		Checking check1 = new Checking("abhi", "1234567", 1500);
//		Savings sav = new Savings("rakesh", "654321432", 2500);
//		sav.compund();
//		sav.showInfo();
//		System.out.println("-----------------------");
//		check1.showInfo();
		// read a csv file then create new account based on that data

//		sav.deposit(5000);
//		sav.withdrawl(200);
//		sav.transfer("rajesh", 244);

		// read csv file

		List<String[]> newAccountHolder = utilities.CSV.read(file);

		for (String[] accountHolder : newAccountHolder) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);

			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE:");
			}

		}

		for (Account acc : accounts) {
			System.out.println("\n-------------------");
			acc.showInfo();
		}
	}

}
