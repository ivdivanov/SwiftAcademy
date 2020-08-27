package lesson02;

import java.util.Scanner;

public class Task1bPrintMirrorNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberFromConsole = Integer.parseInt(sc.nextLine());
		String textRepOfTheNumber = Integer.toString(numberFromConsole);
		int numberOfIterations = textRepOfTheNumber.length();
		
		
		while (numberOfIterations > 0 ) {
			
			System.out.print(textRepOfTheNumber.charAt(numberOfIterations - 1));
			numberOfIterations--;
		}
		
	}

}
