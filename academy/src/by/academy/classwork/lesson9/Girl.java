package by.academy.classwork.lesson9;

public abstract class Girl {

	Double money;
	String name;
	String daiMoney = "Give me your money";

	public String giveMeYourMoney(double money) {
		System.out.println(thinking());
		System.out.println(daiMoney + " " + money);
		return daiMoney;
	}
	
	public abstract String thinking();

}
