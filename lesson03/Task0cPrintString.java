package lesson03;
import java.util.Scanner;

public class Task0cPrintString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a text");

		String textFromConsole = sc.nextLine();

		for (int i = 0; i < textFromConsole.length(); i++) {

			if ((int) textFromConsole.toLowerCase().charAt(i) >= 97
					&& (int) textFromConsole.toLowerCase().charAt(i) <= 122) {
				System.out.println(textFromConsole.charAt(i));
			} else {
				continue;
			}

		}
	}

}
