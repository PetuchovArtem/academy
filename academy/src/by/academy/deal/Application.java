package by.academy.deal;

public class Application {

	public static void main(String[] args) {

		Product cheese = new Cheese(20, "Пармезан", "Итальянская сыроварня", 20, 40);
		Product vinisko = new Vinisko(30, "Шанет", "Минский ликероводоынй", 10, "red");

		Person seller = new Person("ArtemSeller", "375440000000", "testemail@gmail.com", 500.00);
		Person buyer = new Person("ArtemBuyer", "375440000000", "testemail@gmail.com", 500.00);

		Deal deal = new Deal(seller, buyer, "02-07-2021");

		deal.addProduct(cheese);
		deal.addProduct(vinisko);
		
		
		deal.deal();
	}

}
