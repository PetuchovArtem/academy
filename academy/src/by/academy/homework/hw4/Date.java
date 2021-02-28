package by.academy.homework.hw4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.text.ParseException;

//Создать объект класса Date, используя вложенные классы Год, Месяц, День. 
//Методы: задать дату, вывести на консоль день недели по заданной дате. 
//День недели представить в виде перечисления. 
//Рассчитать количество дней, в заданном временном промежутке.
//Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
//После валидации в конструкторе создаем объекты класса Year, Month, Day.
//Добавить метод, который проверяет высокосный ли год или нет.

public class Date {

	private Year year;
	private Month month;
	private Day day;
	private final DateValidator dv = new DateValidator();
	public String date1;
	public String secondDate;

	public Date() {
		super();
	}

	public void setDate(String date) {
		this.date1=date;
		validateDate(date);
	}

	// Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для
	// этой строки.
	private void validateDate(String date) {
		if (dv.validate(date)) {
			this.year = new Year(Integer.parseInt(date.substring(6, 10)));
			this.month = new Month(Integer.parseInt(date.substring(3, 5)));
			this.day = new Day(Integer.parseInt(date.substring(0, 2)));
		} else {
			System.out.println("Введите корректную дату придерживаясь формата : \"dd-mm-yyyy\"");
		}
	}
 
	// выводим день недели красиво
	public String printDayOfWeek() throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date dayWeek = null;
		dayWeek = format.parse(date1);
//		System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));
		return (new SimpleDateFormat("EEEE").format(dayWeek));

	}

	// выводим день недели используя собственоручный enum
	public void dayOfWeek() throws ParseException {
		DaysWeek currentDay = DaysWeek.valueOf(printDayOfWeek());
		switch (currentDay) {
		case Monday:
			System.out.println("Понедельник");
			break;
		case Tuesday:
			System.out.println("Вторник");
			break;
		case Wednesday:
			System.out.println("Среда");
			break;
		case Thursday:
			System.out.println("Четверг");
			break;
		case Friday:
			System.out.println("Пятница");
			break;
		case Saturday:
			System.out.println("Суббота");
			break;
		case Sunday:
			System.out.println("Воскресенье");
			break;
		default:
			System.out.println("Ты пьян");
		}
	}

	// рассчет между двумя датами
	public long getDaysBetweenTwoDates(Date date) {
		LocalDate ld1 = LocalDate.of(getYear(), getMonth(), getDay());
		LocalDate ld2 = LocalDate.of(date.getYear(), date.getMonth(), date.getDay());
		System.out.print("Дней между двумя датами: ");
		return Math.abs(ChronoUnit.DAYS.between(ld1, ld2));
	}

	// Добавить метод, который проверяет высокосный ли год или нет.
	public boolean vesGod() {
		if (getYear() % 4 == 0) {
			System.out.println("Год високосный");
			return getYear() % 400 == 0 || getYear() % 100 != 0;
		}
		System.out.println("Год невисокосный");
		return false;
	}

	public String getDate() {
		return date1;
	}

	public String getSecondDate() {
		return secondDate;
	}

	public void setSecondDate(String secondDate) {
		this.secondDate = secondDate;
	}

	public int getYear() {
		return year.getYear();
	}

	public int getMonth() {
		return month.getMonth();
	}

	public int getDay() {
		return day.getDay();
	}

	private static class Year {
		private final int year;

		Year(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}
	}

	private static class Month {
		private final int month;

		private Month(int month) {
			this.month = month;
		}

		public int getMonth() {
			return month;
		}
	}

	private static class Day {
		private final int day;

		private Day(int day) {
			this.day = day;
		}

		private int getDay() {
			return day;
		}
	}
}
