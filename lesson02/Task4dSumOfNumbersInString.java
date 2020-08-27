package lesson02;

import java.util.Scanner;

public class Task4dSumOfNumbersInString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String textFromConsole = sc.nextLine();
		String numberBuilder = "";
		int sum = 0;
		
		
		for (int i = 0; i < textFromConsole.length(); i++) {
			
			if ((int)textFromConsole.charAt(i) >= 48 && (int)textFromConsole.charAt(i) <= 57) {
				numberBuilder += textFromConsole.charAt(i);
			}else {
				if (numberBuilder.length() > 0) {
					sum += Integer.parseInt(numberBuilder);
				}	
				numberBuilder = "";
			}
				
			
		}
		
		System.out.println(sum);
	}

}
