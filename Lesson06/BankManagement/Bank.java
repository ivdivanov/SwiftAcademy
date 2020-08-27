package BankManagement;

import java.util.LinkedList;
import java.util.List;

import CredentialManager.Credentials;

public class Bank {
	
	
	private static LinkedList<Account> bankAccounts = new LinkedList<Account>();
	private static double assets = 0;
	
	
	
	
	public Bank() {
		
	}

	public void openAccount(String name, String govId, String username, String password) {
		if (checkIfUserExists(username, bankAccounts) == false) {
			bankAccounts.add(new Account(name, govId, username, password));
			System.out.println("account with username: " + username + " has been successfully created");
		}else {
			System.out.println("User already exists");
		}

	}
	
	public void closeAccount(String username, String password) {
		if (findAccount(username, bankAccounts) != null && (findAccount(username, bankAccounts).checkForCorrectPassword(password))) {
			bankAccounts.remove(findAccount(username, bankAccounts));
			System.out.println("The account has been deleted");
		}else {
			System.out.println("The account wasn't found in our bank");
		}
	}
	
	public void deposit(String username, double amount) {
		if (findAccount(username, bankAccounts) != null) {
			findAccount(username, bankAccounts).deposit(amount);
			System.out.println("You have successfully deposited " + amount + " .Your current balance is now" + findAccount(username, bankAccounts).getAvailableMoney());
		}
		else {
			System.out.println("Failed");
		}
	}
	
	public void withdraw(String username, String password, double amount) {
		if (findAccount(username, bankAccounts) != null && findAccount(username, bankAccounts).checkForCorrectPassword(password)) {
			findAccount(username, bankAccounts).withdraw(amount);
		}
		else {
			System.out.println("Failed");
		}
	}
	
	public void transfer(String username, String password, double amount, String recipient) {
		if (findAccount(username, bankAccounts) != null && findAccount(username, bankAccounts).checkForCorrectPassword(password) && findAccount(recipient, bankAccounts) != null) {
			findAccount(username, bankAccounts).withdraw(amount);
			findAccount(recipient, bankAccounts).deposit(amount);
			System.out.println("You have successfully transferred " + amount + " to " + " recipient: " + findAccount(recipient, bankAccounts).getUsername());
		}
		else {
			System.out.println("Failed");
		}
	}
	
	
//	private Account findAccount(String username, LinkedList<Account> acc) {
//		
//		for(Account a : acc) {
//			if (a.equals(username)) {
//				return a;
//			}
//		}
//		
//		return null;
//		
//	}

	private boolean checkIfUserExists(String username, List<Account> users) {
		for (Account user : users) {
			if (user.getUsername().equalsIgnoreCase(username)) {
				return true;
			}
		}
		
		return false;
	}
	
	private Account findAccount(String username, List<Account> users) {
		for (Account user : users) {
			if (user.getUsername().equalsIgnoreCase(username)) {
				return user;
			}
		}
		return null;
	}
	
	public static double getAssets() {
		for (Account user : bankAccounts) {
			assets += user.getAvailableMoney();
		}
		
		return assets;
	}
	
	
	

}




