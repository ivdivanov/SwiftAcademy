package lesson03;
import java.util.Scanner;

public class Task0bReadArray {
	
	public static void main(String[] args) {
		
		
		System.out.println("Type in the size of the array");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[Integer.parseInt(sc.nextLine())];
		
		System.out.println("Type in the elements of the array separated by space");
		String arrayElements = sc.nextLine();
		String[] allElements = arrayElements.split(" ");
		
		int numberOfValidIterations = 0;
		if (array.length > allElements.length) {
			numberOfValidIterations = allElements.length;
		}else {
			numberOfValidIterations = array.length;
		}
	
		
		for (int i = 0; i < numberOfValidIterations; i++) {
			array[i] = Integer.parseInt(allElements[i]);
		}
		
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]+ ",");
			}
			
		}
		
		
	}

}
