package lesson02;

import java.util.Scanner;

public class Task1eIsPrime {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberFromConsole = sc.nextInt();
		boolean isPrime = true;
		
		
		for (int i = 2; i < numberFromConsole; i++) {
			
			if (numberFromConsole % i == 0) {
				System.out.println("Not prime");
				isPrime = false;
				break;
			}
			
		}
		
		if (isPrime) {
			System.out.println("The number is prime");
		}
		
	}

}
