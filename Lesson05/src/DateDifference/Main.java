package DateDifference;

public class Main {
	
	public static void main(String[] args) {
		
		
		SwiftDate date = new SwiftDate(2016, (byte)9,(byte) 26);
		
		System.out.println(date.getCentury());
		System.out.println(date.isLeapYear());
		System.out.println(date.getDaysDifference(1878, (byte)3, (byte)3));
		date.printInfo();
		
	}

}
