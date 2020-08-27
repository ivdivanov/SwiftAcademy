package lesson02;

import java.util.Scanner;

public class Task2aPrintSumOfN {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberFromConsole = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < numberFromConsole; i++) {
			
			System.out.println("Type in " + (numberFromConsole - i) + " more number(s)");
			sum += sc.nextInt();
			
		}
		
		System.out.println("The sum is = " + sum);
		
	}

}
