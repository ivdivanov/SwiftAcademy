package Car;

public class Car {
	
	public String brand;
	public String model;
	public int enginePower;
	public int yearOfCreation;
	
	
	public Car(String brand, String model, int enginePower, int yearOfCreation) {
		if (brand == null || brand.trim().isEmpty()) {
			System.out.println("Invalid name");
			this.brand = "Jigula";
		} else {
			this.brand = brand;
		}
		if (model == null || model.trim().isEmpty()) {
			System.out.println("Invalid name");
			this.model = "Vaz-2101";
		} else {
			this.model = model;
		}
		
		if (enginePower < 3 || enginePower > 5000) {
			System.out.println("Invalid number");
			this.enginePower = 100;
		} else {
			this.enginePower = enginePower;
		}
		if (yearOfCreation < 1920 || yearOfCreation > 2020) {
			System.out.println("Invalid number");
			this.yearOfCreation = 2000;
		} else {
			this.yearOfCreation = yearOfCreation;
		}
	}
	
	
	public double insuranceCategory() {
		double category = 0;
		if (2020 - this.yearOfCreation <= 8) {
			category = 150;
		}else if (2020 - this.yearOfCreation > 8 && 2020 - this.yearOfCreation <= 15) {
			category = 200;
		}else if (2020 - this.yearOfCreation > 15 && 2020 - this.yearOfCreation <= 25) {
			category = 300;
		}else {
			category = 500;
		}
		
		if (this.enginePower < 80) {
			category = category + category*(0.2);
		}else if (this.enginePower > 140) {
			category = category + category*(0.45);
		}
		
		return category;
		
	}
	
	

}
