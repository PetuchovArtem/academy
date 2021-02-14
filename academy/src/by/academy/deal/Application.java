package by.academy.deal;

import java.util.Scanner;

//import testpackage.newDeal.DealDate;

public class Application {

	public static void main(String[] args) {

		Product cheese = new Cheese(20, "Пармезан", "Итальянская сыроварня", 2, 2);
		Product vinisko = new Vinisko(30, "Шанет", "Минский ликероводоынй", 10, "triTopora");
		Product ham = new Ham(20, "Хамон", "ОАО ГрандСтройТрескМоллСырДеллХамВарПил", 2, 2);

		Person seller = new Person("ArtemSeller", "375440000000", "testemail@gmail.com", 10000.00);
		Person buyer = new Person("ArtemBuyer", "375440000000", "testemail@gmail.com", 10000.00);

		DealDateValidator date = new DealDateValidator();
		Scanner console = new Scanner(System.in);
		System.out.println("Введите дату, формат: dd/MM/yyyy либо dd-MM-yyyy: ");

		date.setDate(console.next());

		System.out.println(date.checkDate());
		
		Deal deal = new Deal(seller, buyer);

		deal.addProduct(cheese);
		deal.addProduct(vinisko);
		deal.addProduct(ham);

		deal.deal();
		console.close();
	}

}
