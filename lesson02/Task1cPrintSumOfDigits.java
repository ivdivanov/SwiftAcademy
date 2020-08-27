package lesson02;

import java.util.Scanner;

public class Task1cPrintSumOfDigits {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int numberFromConsole = Integer.parseInt(sc.nextLine());
		int numberFromConsoleRecursionTest = Integer.parseInt(sc.nextLine());
		int modifier = 1;
		int sum = 0;
	
		
		while ((numberFromConsole / modifier) > 0 ) {
			
			sum += numberFromConsole % 10;
			numberFromConsole /= 10;

			
		}
		
		System.out.println(sum);
		System.out.println(test(numberFromConsoleRecursionTest, 0));
		

		
	}
	
	public static int test(int numberFromConsoleRecursionTest, int sum) {
		
		int modifier = 1;
		
		
		
		if ((numberFromConsoleRecursionTest / modifier) < 1) {
			return sum;
		}else {
			sum +=(numberFromConsoleRecursionTest%10);
			return test((numberFromConsoleRecursionTest / 10), sum);
		}
		
	
	}
	

}
