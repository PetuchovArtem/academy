package by.academy.cat;

public class Cat {

	int age;
	String nickname;
	double money;
	char initials;
	boolean isHomeAnimal;

	public Cat() {
		super();
	}

	public Cat(String nickname) {
		super();
		this.nickname = nickname;
	}

	public void grow() {
		age++;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void sleep() {
		System.out.println("Sleep");
	}

	public void eat() {
		System.out.println("Eat");
	}

	public void walk() {
		System.out.println("Walk");
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void setInitials(String nickname) {
		this.initials = nickname.charAt(0);
	}

	public char getInitials() {
		return initials;
	}

	public void setIsHomeAnimal(String nickname) {
		if (nickname != null) {
			this.isHomeAnimal = true;
		} else {
			this.isHomeAnimal = false;
		}
	}

	public void isHomeAnimal() {
		if (isHomeAnimal == true) {
			System.out.println("Кот домашний");
		} else {
			System.out.println("Кот бездомный");
		}

	}

}
