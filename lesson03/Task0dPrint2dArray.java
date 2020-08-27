package lesson03;

public class Task0dPrint2dArray {

	public static void main(String[] args) {

		int[][] array2D = new int[4][4];
		int counter = 1;

		for (int i = 0; i < array2D.length; i++) {
			System.out.println();

			for (int j = 0; j < array2D.length; j++) {
				array2D[i][j] += counter;
				counter++;
				System.out.print(array2D[i][j] + " ");
			}
		}

	}

}
