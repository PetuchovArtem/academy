package by.academy.cat;

public class Application {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Nensy");

		System.out.println("Cat1: ");
		cat1.eat();
		cat1.grow();
		cat1.sleep();
		cat1.walk();

		System.out.println("Cat2: ");
		cat2.eat();
		cat2.grow();
		cat2.grow();
		cat2.grow();
		cat2.sleep();
		cat2.walk();
		System.out.println(cat2.getAge());

		// Alt+Shift+S -> generate getters/setters - создание гетеров, сетеров
	}

}
