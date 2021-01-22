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
		cat1.setMoney(1.4);
		System.out.println(cat1.getMoney());
		cat1.setIsHomeAnimal(cat1.nickname);
		cat1.isHomeAnimal();

		System.out.println("Cat2: ");
		cat2.eat();
		cat2.grow();
		cat2.grow();
		cat2.grow();
		cat2.sleep();
		cat2.walk();
		cat2.setInitials(cat2.nickname);
		System.out.println(cat2.getAge());
		System.out.println(cat2.getInitials());
		cat2.setIsHomeAnimal(cat2.nickname);
		cat2.isHomeAnimal();

		// Alt+Shift+S -> generate getters/setters - создание гетеров, сетеров
	}

}
