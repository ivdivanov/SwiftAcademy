package lesson02;

import java.util.Scanner;

public class Task1aPrintFirstDigit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberFromConsole = Integer.parseInt(sc.nextLine());
		
		char takeTheFistDigit = Integer.toString(numberFromConsole).charAt(0);
		
		System.out.println(takeTheFistDigit);
		
	}

}
