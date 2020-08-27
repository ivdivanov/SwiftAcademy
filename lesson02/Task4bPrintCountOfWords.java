package lesson02;

import java.util.Scanner;

public class Task4bPrintCountOfWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String textFromConsole = sc.nextLine();
		textFromConsole = textFromConsole.trim();
		textFromConsole = textFromConsole.replace(".", "");
		textFromConsole = textFromConsole.replace("’", "");
		textFromConsole = textFromConsole.replace(",", "");
		textFromConsole = textFromConsole.replace("'", "");
		int wordCounter = 0;
		boolean isItAWord = true;

		for (int i = 0; i < textFromConsole.length(); i++) {
			

			if (textFromConsole.charAt(i) == ' ' && isItAWord) {
				wordCounter += 1;
				
			}else if ((int) textFromConsole.toLowerCase().charAt(i) < 97
					|| (int) textFromConsole.toLowerCase().charAt(i) > 122) {
				isItAWord = false;
				
			}else if (textFromConsole.charAt(i) == ' ') {
				isItAWord = true;
			}
		
			if (i == (textFromConsole.length() - 1) && isItAWord) {
				wordCounter += 1;
			}

		}
		
		System.out.println(wordCounter);
	}

}
