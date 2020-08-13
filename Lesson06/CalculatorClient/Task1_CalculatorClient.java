package CalculatorClient;

import java.util.Scanner;

public class Task1_CalculatorClient {
	
	public static void main(String[] args) {
		
		boolean calcWorking = true;
		
		
		while (calcWorking) {
			
			
			String command;
			String[] operations;
			Scanner sc = new Scanner(System.in);
			command = sc.nextLine();
			operations = command.split(" ");
			
			switch (operations[0].toLowerCase()) {
			case "sum":
					System.out.println(sum(Double.parseDouble(operations[1]), Double.parseDouble(operations[2])));
				break;
			case "sub":
				System.out.println(substract(Double.parseDouble(operations[1]), Double.parseDouble(operations[2])));
				break;
			case "mul":
				System.out.println(substract(Double.parseDouble(operations[1]), Double.parseDouble(operations[2])));
				break;
			case "div":
				System.out.println(substract(Double.parseDouble(operations[1]), Double.parseDouble(operations[2])));
				break;
			case "per":
				System.out.println(substract(Double.parseDouble(operations[1]), Double.parseDouble(operations[2])));
				break;
			case "end":
				calcWorking = false;
				break;
			default:
				System.out.println("Invalid command. Please use" + "\n" + "sum for sum of the two number" + "\n"
			+ "sub for division" + "\n" + "mul for multiplying" + "\n" + "div for division" + "per for percentage of the second number from the first one"  + "\n"
			+ " follow it by a white space, write the first number and then another space for the second number");
				break;
			}
			
		
		}
		
	}
	
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	public static double substract(double a, double b) {
		return a - b;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	public static double divide(double a, double b) {
		return a / b;
	}
	
	public static double percentage(double a, double b) {
		return b/a;
	}

}
