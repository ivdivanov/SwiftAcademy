package Person;

public class Main {
	
	public static void main(String[] args) {
		
		
		Person pesho = new Person("test");
		pesho.getPeronInfo();
		pesho.age = 20;
		
		pesho.getAge();
		
		
		System.out.println(pesho.getPeronInfo());

	}

}
