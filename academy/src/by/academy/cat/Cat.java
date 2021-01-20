package by.academy.cat;

public class Cat {

	int age;
	String nickname;

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

}
