package lesson03;

public class Task1PrintMatrixA {

	public static void main(String[] args) {

		int[][] array2D = new int[4][4];
		int counter = 1;

		for (int i = 0; i < array2D.length; i++) {

			for (int j = 0; j < array2D.length; j++) {
				array2D[j][i] += counter;
				counter++;
			}

		}

		for (int i = 0; i < array2D.length; i++) {
			System.out.println();

			for (int j = 0; j < array2D.length; j++) {
				System.out.print(array2D[i][j] + " ");
			}

		}

	}

}
