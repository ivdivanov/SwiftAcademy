package BankManagement;

import java.io.ObjectInputStream.GetField;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import CredentialManager.Credentials;

public class Task3_BankManager {

	public static void main(String[] args) {

		boolean progWorking = true;
		Bank obb = new Bank();

		while (progWorking) {

			String command;
			String[] operations;
			Scanner sc = new Scanner(System.in);
			command = sc.nextLine();
			operations = command.split(" ");

			switch (operations[0].toLowerCase()) {
				case "open":
					obb.openAccount(operations[1], operations[2], operations[3], operations[4]);
					break;
				case "close":
					obb.closeAccount(operations[1], operations[2]);
					break;
				case "deposit":
					obb.deposit(operations[1], Double.parseDouble(operations[2]));
					break;
				case "withdraw":
					obb.withdraw(operations[1], operations[2], Double.parseDouble(operations[3]));
					break;
				case "transfer":
					obb.transfer(operations[1], operations[2], Double.parseDouble(operations[3]), operations[4]);
					break;	
				case "assets":
					System.out.println("Bank assets are: " + obb.getAssets());
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
	
}
