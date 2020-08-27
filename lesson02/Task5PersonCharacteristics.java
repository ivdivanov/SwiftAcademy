package lesson02;

import java.util.Scanner;

public class Task5PersonCharacteristics {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int numberOfPeopleToIterate = Integer.parseInt(sc.nextLine());
		boolean wrongInfo = true;
		String firstName = "Georgi";
		String lastName = "Georgiev";
		int yearOfBirth = 2002;
		int currYear = 2020;
		double weightInKg = 48.3;
		int heightInCm = 156;
		String occupation = "student";
		
		for (int i = 0; i < numberOfPeopleToIterate; i++) {
			
			while (wrongInfo) {
				
				System.out.println("Please type in the name for the " +  (i+1) + " person");
				firstName = sc.nextLine();
				if (firstName == "" || firstName.isEmpty() || firstName == null) {
					continue;
				}

				System.out.println("Please type in the last name for the " +  (i+1) + " person");
				lastName = sc.nextLine();
				if (lastName == "" || lastName.isEmpty() || lastName == null) {
					continue;
				}
				
				System.out.println("Please type in the year of birth for the " +  (i+1) + " person");
				yearOfBirth = Integer.parseInt(sc.nextLine());
				if (yearOfBirth > 2020 || yearOfBirth < 1900) {
					continue;
				}
				
				System.out.println("Please type in the weight of the " +  (i+1) + " person");
				weightInKg = Double.parseDouble(sc.nextLine());
				if (weightInKg < 1 || weightInKg > 500) {
					continue;
				}
				
				System.out.println("Please type in the height of the " +  (i+1) + " person");
				heightInCm = Integer.parseInt(sc.nextLine());
				if (heightInCm < 30 || heightInCm > 300) {
					continue;
				}
				System.out.println("Please type in occupation " +  (i+1) + " person");
				occupation = sc.nextLine();
				if (occupation == "" || occupation.isEmpty() || occupation == null) {
					continue;
				}
				
				String growUpText = (currYear - yearOfBirth) < 18 ?
						"He is a " + occupation +". " + firstName + " " + lastName + " is under-aged" :
							"He is a " + occupation;
				
				System.out.println(firstName + " " + lastName + " is " + (currYear - yearOfBirth) + " years old. His weight is " + weightInKg
						+ " and he is " + heightInCm + " cm tall." + growUpText);
				break;
					
				
			}
			
		}
		
	}

}
