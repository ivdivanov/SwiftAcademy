package EmployeeSalarySort;

public class Employee {

	public String name;
	public double salary;
	public String position;
	public String department;
	public short age;
	public String emailAddress;

	public Employee(String name, double salary, String position, String department) {
		if (name != null && !name.trim().isEmpty()) {
			this.name = name;
		} else {
			this.name = "Unknown";
		}
		if (salary > 0) {
			this.salary = salary;
		} else {
			this.salary = 240;
		}
		if (position != null && !position.trim().isEmpty()) {
			this.position = position;
		} else {
			this.position = "Worker";
		}
		if (department != null && !department.trim().isEmpty()) {
			this.department = department;
		} else {
			this.department = "Unkown";
		}
	}

	public Employee(String name, double salary, String position, String department, short age) {
		this(name, salary, position, department);
		if (age > 0 && age < 130) {
			this.age = age;
		} else {
			this.age = 25;
		}
	}

	public Employee(String name, double salary, String position, String department, String emailAddress) {
		this(name, salary, position, department);
		if (emailAddress != null && !emailAddress.trim().isEmpty()) {
			this.emailAddress = emailAddress;
		} else {
			this.emailAddress = "default@abv.bg";
		}
	}

	public Employee(String name, double salary, String position, String department, short age, String emailAddress) {
		this(name, salary, position, department);
		if (age > 0 && age < 130) {
			this.age = age;
		} else {
			this.age = 25;
		}
		if (emailAddress != null && !emailAddress.trim().isEmpty()) {
			this.emailAddress = emailAddress;
		} else {
			this.emailAddress = "default@abv.bg";
		}
	}

	public String getInfo() {
		if (emailAddress != null && !emailAddress.trim().isEmpty()) {
			return this.name + ", " + this.department + ", " + this.position + ", " + this.emailAddress;
		}
		return this.name + ", " + this.department + ", " + this.position;
	}

	public double getSalary() {
		return salary;
	}

}
