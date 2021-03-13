package by.academy.classwork.lesson18;

public class Tiger extends Cat {

	public String petsName1;
	protected String parrentName1;
	private int age1;

	public Tiger() {
		super();
	}

	public Tiger(String petsName1, String parrentName1, int age1) {
		this.petsName1 = petsName1;
		this.parrentName1 = parrentName1;
		this.age1 = age1;
	}

	public void printPetsName1() {
		System.out.println(petsName1);
	}

	protected void printParrentName1() {
		System.out.println(parrentName1);
	}

	private void printAge1() {
		System.out.println(age1);
	}

	public String getPetsName1() {
		return petsName1;
	}

	private void run() {
		System.out.println("tiger run run");
	}

	
	
	public void setPetsName1(String petsName1) {
		this.petsName1 = petsName1;
	}

	public String getParrentName1() {
		return parrentName1;
	}

	public void setParrentName1(String parrentName1) {
		this.parrentName1 = parrentName1;
	}

	public int getAge1() {
		return age1;
	}

	public void setAge1(int age1) {
		this.age1 = age1;
	}

}
