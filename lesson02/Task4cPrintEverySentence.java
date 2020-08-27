package lesson02;

import java.util.Scanner;

public class Task4cPrintEverySentence {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String textFromConsole = sc.nextLine();
		textFromConsole = textFromConsole.trim();
		String newLineText = "";
		
		
		for (int i = 0; i < textFromConsole.length(); i++) {
			
			if (textFromConsole.charAt(i) == '.' || textFromConsole.charAt(i) == '?' || textFromConsole.charAt(i) == '!') {
				newLineText += textFromConsole.charAt(i) + "\r\n";
			}else if(textFromConsole.charAt(i) == ' ' && i > 0 && (textFromConsole.charAt(i - 1) == '.' || textFromConsole.charAt(i - 1) == '?' 
					|| textFromConsole.charAt(i - 1) == '!')) {
				continue;
			}else {
				newLineText += textFromConsole.charAt(i);
			}
				
					
		}
		
		System.out.println(newLineText);
		
	}

}
