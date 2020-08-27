package lesson02;

import java.util.Scanner;

public class Task1dPrintAllDivisors {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberFromConsole = sc.nextInt();
		
		for (int i = numberFromConsole; i >= 1; i--) {
			if (numberFromConsole % i == 0) {
				System.out.print((numberFromConsole / i) + " ");
			}
		}
		
	}

}
