package lesson02;

import java.util.Scanner;

public class Task3bPrintZFigure {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberFromConsole = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < numberFromConsole; i++) {

			System.out.println();
			for (int j = 0; j < numberFromConsole; j++) {

				if (i == 0 || i == (numberFromConsole - 1)) {
					System.out.print("* ");
				} else if (i + j == (numberFromConsole - 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}

		}
	}

}
