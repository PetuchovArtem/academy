package by.academy.deal;

public class Application {

	public static void main(String[] args) {

		Product cheese = new Cheese(20, "Пармезан", "Итальянская сыроварня", 2, 2);
		Product vinisko = new Vinisko(30, "Шанет", "Минский ликероводоынй", 10, "triTopora");
		Product ham = new Ham(20, "Пармезан", "Итальянская сыроварня", 2, 2);

		Person seller = new Person("ArtemSeller", "375440000000", "testemail@gmail.com", 10000.00);
		Person buyer = new Person("ArtemBuyer", "375440000000", "testemail@gmail.com", 10000.00);

		Deal deal = new Deal("07-02-2021", seller, buyer);

		deal.addProduct(cheese);
		deal.addProduct(vinisko);
		deal.addProduct(ham);

		deal.deal();
	}

}
