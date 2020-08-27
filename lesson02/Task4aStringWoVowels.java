package lesson02;

import java.util.Scanner;

public class Task4aStringWoVowels {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String textFromConsole = sc.nextLine();
		String newTest = "";
		
		
		for (int i = 0; i < textFromConsole.length(); i++) {
			if (textFromConsole.toLowerCase().charAt(i) == 'a' || textFromConsole.toLowerCase().charAt(i) == 'e'
					|| textFromConsole.toLowerCase().charAt(i) == 'u' || textFromConsole.toLowerCase().charAt(i) == 'i'
					|| textFromConsole.toLowerCase().charAt(i) == 'o' || textFromConsole.toLowerCase().charAt(i) == 'y') {
				continue;			
			}else {
				newTest += textFromConsole.charAt(i);
			}
		}
		
		System.out.println(newTest);
		
	}

}
