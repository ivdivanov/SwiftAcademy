package Person;

public class Person {

	public String name;
	public short age;

	public Person() {
		this.name = "No Name";
		this.age = -1;
	}

	public Person(String name) {
		System.out.println("A new person was born!!!");
		if (name == null || name.trim().isEmpty()) {
			System.out.println("Invalid name");
			this.name = "No Name";
		} else {
			this.name = name;
		}
		this.age = -1;
	}

	public Person(String name, short age) {
		if (name == null || name.trim().isEmpty()) {
			System.out.println("Invalid name");
			this.name = "No Name";
		} else {
			this.name = name;
		}
		if (age < 0 || age > 120) {
			System.out.println("Invalid age");
			this.age = -1;
		} else {
			this.age = age;
		}

	}

	public String getPeronInfo() {
		return (this.name.equals("No Name") ? "I am John Doe." : "My name is " + (this.name))
				+ ((this.age < 0) ? "" : ". I am " + (this.age) + " years old.");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			System.out.println("Invalid name");
			this.name = "No Name";
		} else {
			this.name = name;
		}
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		if (age < 0 || age > 120) {
			System.out.println("Invalid age");
			this.age = -1;
		} else {
			this.age = age;
		}
	}
	

}


	



