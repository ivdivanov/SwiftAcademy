package lesson03;

public class Task1PrintMatrixB {

	public static void main(String[] args) {

		int[][] array2D = new int[4][4];
		int counter = 1;

		for (int i = 0; i < array2D.length; i++) {

			for (int j = 0; j < array2D.length; j++) {
				
				if (i % 2 == 0) {
					array2D[j][i] += counter;
					counter++;
				}else {
					array2D[array2D.length - j - 1][i] += counter;
					counter++;
				}

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
