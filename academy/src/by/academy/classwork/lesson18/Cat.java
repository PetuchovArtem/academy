package by.academy.classwork.lesson18;

public class Cat {
	public String petsName;
	protected String parrentName;
	private int age;

	public Cat() {
		super();
	}

	public Cat(String petsName, String parrentName, int age) {
		this.petsName = petsName;
		this.parrentName = parrentName;
		this.age = age;
	}

	public void printPetsName() {
		System.out.println(petsName);
	}

	protected void printParrentName() {
		System.out.println(parrentName);
	}

	private void printAge() {
		System.out.println(age);
	}

	public String getPetsName() {
		return petsName;
	}

	public void setPetsName(String petsName) {
		this.petsName = petsName;
	}

	public String getParrentName() {
		return parrentName;
	}

	public void setParrentName(String parrentName) {
		this.parrentName = parrentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
