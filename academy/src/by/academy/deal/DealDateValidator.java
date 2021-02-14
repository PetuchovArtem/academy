package by.academy.deal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DealDateValidator {
	String pattern1 = "\\d{2}-\\d{2}-\\d{4}";
	String pattern2 = "\\d{2}/\\d{2}/\\d{4}";
	static String date;

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	public DealDateValidator() {
		super();
	}

	public DealDateValidator(String date) {
		super();
		this.date = date;
	}

	public static String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean checkDate() {
		if (date.matches(pattern1)) {
				}
		if (date.matches(pattern2)) {
				}
		return false;
	}

	public void printDate() {
//		localDate = localDate.plusYears(30);
//		localDate = localDate.minusMonths(7);
//		localDate = localDate.minusDays(3);
		System.out.println(date);
	}
	
	
}
