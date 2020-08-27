package BankManagement;

public abstract class Credentials {
	
	private String username;
	private String password;
	private String[] prevPasswords = new String[100];

	private int passCounter = 0;
	
	
	
	public Credentials(String username, String password) {
		
		if (username != null && username != "") {
			this.username = username;
		}else {
			this.username = "JohnDoe";
		}
		
		if (password != null && password != "") {
			this.password = password;
		}else {
			this.username = "password";
		}
		
		addNewestPassword(password);
		
	}
	
	public String getUsername() {
		return username;
	}
	
	public boolean checkForCorrectPassword(String pass) {
		if (this.password.equals(pass)) {
			return true;
		}
		return false;
	}

	
	public void setNewPassword(String username, String password, String newPassword) {
		
		if (username.equals(this.username) && checkForCorrectPassword(password) && checkForExistingPass(newPassword)) {
			this.password = newPassword;
			this.passCounter += 1;
			addNewestPassword(newPassword);
			System.out.println("Successfully changed your password");
		}else {
			System.out.println("Failed");
		}
		
	}
		
	private boolean checkForExistingPass(String newPassword) {		
		for(String p : prevPasswords) {			
			if (newPassword.equals(p)) {
				return false;
			}		
		}		
		return true;	
	}
	
	private void addNewestPassword(String newPassword) {		
		prevPasswords[this.passCounter] = newPassword;
	}

}
