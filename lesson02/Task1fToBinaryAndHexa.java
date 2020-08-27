package lesson02;

import java.util.Scanner;

public class Task1fToBinaryAndHexa {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int numberFromConsole = sc.nextInt();
		int numberForBinaryCalc = numberFromConsole;
		String binaryNumber = "";
		String hexaNumber = "";

		while (numberForBinaryCalc != 0) {
			
			binaryNumber += ("" + numberForBinaryCalc % 2 );
			numberForBinaryCalc /= 2;
		}
		
		while (numberFromConsole != 0) {
			
			if (numberFromConsole % 16 == 10) {
				hexaNumber += "A";
			}else if (numberFromConsole % 16 == 12) {
				hexaNumber += "B";
			}
			else if (numberFromConsole % 16 == 12) {
				hexaNumber += "C";
			}
			else if (numberFromConsole % 16 == 13) {
				hexaNumber += "D";
			}
			else if (numberFromConsole % 16 == 14) {
				hexaNumber += "E";
			}
			else if (numberFromConsole % 16 == 15) {
					hexaNumber += "F";				
			}else {
				hexaNumber += ("" + numberFromConsole % 16 );
			}
			numberFromConsole /= 16;

		}
		
	
		for (int i = binaryNumber.length(); i > 0; i--) {
			
			System.out.print(binaryNumber.charAt(i-1));
		}
		
		System.out.println();
		
		for (int i = hexaNumber.length(); i > 0; i--) {
			
			System.out.print(hexaNumber.charAt(i-1));
		}
		
	}

}
