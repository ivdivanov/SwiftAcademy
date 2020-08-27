package lesson02;

import java.util.Scanner;

public class Task2bPrintReversedSequence {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberFromConsole = Integer.parseInt(sc.nextLine());
		
		String typedOrder = "";
		
		for (int i = 0; i < numberFromConsole; i++) {
			
			System.out.println("Type in " + (numberFromConsole - i) + " more number(s)");
			typedOrder += sc.nextLine();
			
		}
		
		for (int i = typedOrder.length(); i > 0; i--) {
			System.out.print(typedOrder.charAt(i-1) + " ");
		}
		
		
		
	}

}
