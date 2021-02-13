package by.academy.classwork.lesson10;

public enum WeekDays {

	PONEDELNIK("день тяжелый", 1), VTORNIK("ворк дэй"), SREDA("ворк дэй", 3), CHETVERG("ворк дэй", 4),
	PIATNIZZA("ворк дэй", 5), SUBBOTA("Можно погулять", 6), VOSKRESENIE("Конец недели", 7), PIANIZZA("ты пьян", 8);

	private String s;
	private int i;

	WeekDays(String s, int i) {
		this.s = s;
		this.i = i;
	}

	WeekDays(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public int getI() {
		return i;
	}

}
