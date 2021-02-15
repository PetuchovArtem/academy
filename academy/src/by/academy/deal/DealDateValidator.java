package by.academy.deal;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.ParseException;

public class DealDateValidator {
	String pattern1 = "\\d{2}-\\d{2}-\\d{4}";
	String pattern2 = "\\d{2}/\\d{2}/\\d{4}";
	static String date;
	Date dateDeal = new Date();
	SimpleDateFormat df = new SimpleDateFormat("'Day: '<dd> \n'Month: '<MM>' \nYear: '<yyyy>");

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

	public boolean checkDate() throws ParseException {
		if (date.matches(pattern1)) {
			SimpleDateFormat df1 = new SimpleDateFormat("dd-MM-yyyy");
			dateDeal = df1.parse(date);
			System.out.println(df.format(dateDeal.getTime()));
			System.out.println(true);
			return true;
		} else if (date.matches(pattern2)) {
			SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
			dateDeal = df1.parse(date);
			System.out.println(df.format(dateDeal.getTime()));
			System.out.println(true);
			return true;
		}
		System.out.print(false);
		return false;
	}

}
