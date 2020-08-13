package CredentialManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2_CredentialsManager {
	

public static void main(String[] args) {
		
		boolean progWorking = true;
		List<Credentials> users = new LinkedList<>();
		int userid = 0;
		
		while (progWorking) {
					
			String command;
			String[] operations;
			Scanner sc = new Scanner(System.in);
			command = sc.nextLine();
			operations = command.split(" ");
			
			switch (operations[0].toLowerCase()) {
			case "enroll":
					if (checkIfUserExists(operations[1], users) == false) {
						users.add(new Credentials(operations[1],operations[2]));
						System.out.println("User was created");
					}else {
						System.out.println("Creating user failed. Username already exists");
					}					
				break;
			case "chpass":
				if (checkIfUserExists(operations[1], users)) {
					if (selectUser(operations[1], users) != null) {
						selectUser(operations[1], users).setNewPassword(operations[1],operations[2],operations[3]);
					}
				}else {
					System.out.println("Failed to update the new password.");
				}
				break;
			case "auth":
				if (checkIfUserExists(operations[1], users)) {
					if (selectUser(operations[1], users) != null) {
						selectUser(operations[1], users).checkForCorrectPassword(operations[2]);
					}
				}else {
					System.out.println("Incorrect password.");
				}
				break;
			case "end":
				progWorking = false;
				break;
			default:
				System.out.println("Invalid command");
				break;
			}
			
		
		}
		
	}

	public static boolean checkIfUserExists(String username, List<Credentials> users) {
		for (Credentials user : users) {
			if (user.getUsername().equalsIgnoreCase(username)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static Credentials selectUser(String username, List<Credentials> users) {
		for (Credentials user : users) {
			if (user.getUsername().equalsIgnoreCase(username)) {
				return user;
			}
		}
		
		
		return null;
	}
	

}
