package BankManagement;

import java.util.List;

import CredentialManager.Credentials;

public class Account extends Credentials{
	
	private double availableMoney;
	private String name;
	private String govID;

	public Account(String name, String govID,String username, String password) {
		super(username, password);
		
		if (name != null && name != "") {
			this.name = name;
		}else {
			this.name = "JohnDoe";
		}
		
		if (govID != null && govID != "") {
			this.govID = password;
		}else {
			this.govID = "password";
		}
		
	}
	
	@Override
	public String getUsername() {
		return super.getUsername();
	}
	
	public double deposit(double amount) {
		return availableMoney += amount;
	}

	public double getAvailableMoney() {
		return availableMoney;
	}
	
	public void withdraw(double amount) {
		if ((this.availableMoney - amount) >= 0) {
			this.availableMoney -= amount;
			System.out.println("Curr balance now is " + getAvailableMoney());
		}else {
			System.out.println("Not enough money");
		}
		
	}
	

	
	
	

}
