package lesson02;

import java.util.Scanner;

public class Task2cPrintOnlyEvenNumbers {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberFromConsole = Integer.parseInt(sc.nextLine());
		String evenNumbers = "";
		
		
		for (int i = 0; i < numberFromConsole; i++) {
			
			System.out.println("Type in " + (numberFromConsole - i) + " more number(s)");
			int currNumber = Integer.parseInt(sc.nextLine());
			if (currNumber % 2 == 0) {
				evenNumbers += currNumber + " ";
			}
			
		}
		
		System.out.println(evenNumbers);
		
	}

}
