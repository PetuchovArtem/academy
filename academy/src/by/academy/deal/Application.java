package by.academy.deal;

public class Application {

	public static void main(String[] args) {

		Product cheese = new Cheese(50, "Пармезан", "Итальянская сыроварня", 5, 10);
		Product vinisko = new Vinisko(50, "Шанет", "Минский ликероводоынй", 5, "red");

		Person seller = new Person("ArtemSeller", "375440000000", "testemail@gmail.com", 500.00);
		Person buyer = new Person("ArtemBuyer", "375440000000", "testemail@gmail.com", 500.00);

		Deal deal = new Deal(seller, buyer, "02-07-2021");
			
		
		deal.addProduct(cheese);
		deal.addProduct(vinisko);
		
		
		deal.deal();
	}

}
