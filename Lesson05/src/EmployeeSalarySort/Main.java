package EmployeeSalarySort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Employee pesho = new Employee("Pesho", 2000, "Developer", "DevOps", (short) 26, "pesho@gmail.com");
//		Employee gosho = new Employee("Gosho", 2800, "Leader", "DevOps");
//		Employee svetla = new Employee("Svetla", 1970.11, "Manager", "Sales", (short) 31, "svetla@gmail.com");
//		Employee iva = new Employee("Iva", 2000, "Janitor", "Cleaning");
//		Employee tina = new Employee("Pesho", 3333.33, "Sales", "DevOps", (short) 42, "tina@gmail.com");

		Scanner sc = new Scanner(System.in);
		System.out.println("Type in the amount of workers");
		int numberOfWorkers = Integer.parseInt(sc.nextLine());
		Employee[] company = new Employee[numberOfWorkers];
		String employeeInfo;
		for (int i = 0; i < numberOfWorkers; i++) {
			System.out.println("Type in the name,salary,position,department for your worker. You can also add"
					+ "your employees age and email address. All info should be separated with commas");
			employeeInfo = sc.nextLine();
			String[] fieldsInfo = employeeInfo.split(",");
			if (fieldsInfo.length == 4) {
				company[i] = new Employee(fieldsInfo[0].trim(), Double.parseDouble(fieldsInfo[1].trim()), fieldsInfo[2].trim(),
						fieldsInfo[3].trim());
			} else if (fieldsInfo.length == 6) {
				company[i] = new Employee(fieldsInfo[0].trim(), Double.parseDouble(fieldsInfo[1].trim()), fieldsInfo[2].trim(),
						fieldsInfo[3].trim(), Short.parseShort(fieldsInfo[4].trim()), fieldsInfo[5].trim());
			} else if (fieldsInfo.length == 5 && Short.parseShort(fieldsInfo[4].trim()) > 0) {
				company[i] = new Employee(fieldsInfo[0].trim(), Double.parseDouble(fieldsInfo[1].trim()), fieldsInfo[2].trim(),
						fieldsInfo[3].trim(), Short.parseShort(fieldsInfo[4]));
			} else if (fieldsInfo.length == 5 && (fieldsInfo[4].trim()) != "") {
				company[i] = new Employee(fieldsInfo[0].trim(), Double.parseDouble(fieldsInfo[1].trim()), fieldsInfo[2].trim(),
						fieldsInfo[3].trim(), fieldsInfo[4].trim());
			} else {
				System.out.println("Invalid information");
			}

		}

		for (Employee e : company) {

			for (int i = 0; i < company.length - 1; i++) {

				if (company[i].getSalary() < company[i + 1].getSalary()) {
					Employee temp = company[i];
					company[i] = company[i + 1];
					company[i + 1] = temp;

				}
			}
		}
		
		int threeWealthiestEmployees = 0;
		
		for (int i = 0; i < company.length; i++) {
			System.out.println(company[i].getInfo());
			threeWealthiestEmployees++;
			
			if (threeWealthiestEmployees >= 3) {
				break;
			}
		}
	}

}
