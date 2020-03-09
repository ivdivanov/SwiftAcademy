package DateDifference;

import java.text.SimpleDateFormat;

public class SwiftDate {

	public byte day;
	public byte month;
	public int year;

	public SwiftDate(int year, byte month, byte day) {
		if (day < 1 || day > 31) {
			System.out.println("Invalid day");
			this.day = 1;
		} else {
			this.day = day;
		}
		if (month < 1 || month > 12) {
			System.out.println("Invalid month");
			this.month = 1;
		} else {
			this.month = month;
		}
		if (year < 1) {
			System.out.println("Invalid year");
			this.year = 1;
		} else {
			this.year = year;
		}

	}

	public boolean isLeapYear() {

		if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0) {
			return true;
		}
		return false;

	}

	public int getCentury() {
		return (this.year / 100) + 1;
	}

	public int getDaysDifference(int year, byte month, byte day) {


		return Math.abs(calcObjectDateInDays() - calcEnteredDateInDays(year,month,day));

	}
	
	public void printInfo() {
		
		System.out.println(this.year + " " + this.month + " " + this.day + " - " + getCentury() + " century." + (isLeapYear() ? "It is a leap year" : ""));
		
	}
	
	private int calcEnteredDateInDays(int year, byte month, byte day) {
		int valueOfNewDate = day;
	
		for (int i = 0; i <= year; i++) {

			if (i == year) {

				for (int j = 1; j <= month; j++) {
					if (j == 2) {
						valueOfNewDate += 29;
					} else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12) {
						valueOfNewDate += 31;
					} else {
						valueOfNewDate += 30;
					}
					break;
				}

			}

			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {

				for (int j = 1; j <= 12; j++) {
					if (j == 2) {
						valueOfNewDate += 29;
					} else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12) {
						valueOfNewDate += 31;
					} else {
						valueOfNewDate += 30;
					}
				}

			} else {
				for (int j = 1; j <= 12; j++) {
					if (j == 2) {
						valueOfNewDate += 28;
					} else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12) {
						valueOfNewDate += 31;
					} else {
						valueOfNewDate += 30;
					}
				}
			}

		}
		
		return valueOfNewDate;
	}
	
	private int calcObjectDateInDays() {
		int valueOfObjectYear = this.day;
		
		for (int i = 0; i <= this.year; i++) {

			if (i == this.year) {

				for (int j = 1; j <= this.month; j++) {
					if (j == 2) {
						valueOfObjectYear += 29;
					} else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12) {
						valueOfObjectYear += 31;
					} else {
						valueOfObjectYear += 30;
					}
					break;
				}

			}

			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {

				for (int j = 1; j <= 12; j++) {
					if (j == 2) {
						valueOfObjectYear += 29;
					} else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12) {
						valueOfObjectYear += 31;
					} else {
						valueOfObjectYear += 30;
					}
				}

			} else {
				for (int j = 1; j <= 12; j++) {
					if (j == 2) {
						valueOfObjectYear += 28;
					} else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12) {
						valueOfObjectYear += 31;
					} else {
						valueOfObjectYear += 30;
					}
				}
			}

		}
		
		return valueOfObjectYear;
	}

}
