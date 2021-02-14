package by.academy.deal;

import java.text.ParseException;
import java.util.Scanner;

//import testpackage.newDeal.DealDate;

public class Application {

	public static void main(String[] args) throws ParseException {

		Product cheese = new Cheese(20, "Пармезан", "Итальянская сыроварня", 5, 20);
		Product vinisko = new Vinisko(30, "Шанет", "Минский ликероводоынй", 10, "triTopora");
		Product ham = new Ham(20, "Хамон", "ОАО ГрандСтройТрескМоллСырДеллХамВарПил", 2, 20);

		Person seller = new Person("ArtemSeller", "+375440000000", "testemail@gmail.com", 10000.00);
		Person buyer = new Person("ArtemBuyer", "+375440000000", "testemail@gmail.com", 10000.00);

		DealDateValidator date = new DealDateValidator();
		Scanner console = new Scanner(System.in);

		System.out.println("Введите дату, формат: dd/MM/yyyy либо dd-MM-yyyy: ");

		date.setDate(console.next());

		date.checkDate();

		Deal deal = new Deal(seller, buyer);

		BelarusPhoneValidator q = new BelarusPhoneValidator();
		System.out.println("Валидация номера телефона: " + q.validator(deal.getBuyer().getPhone()));
		System.out.println("--------------------------------");
		System.out.println("Deal: ");
		System.out.println("--------------------------------");

		deal.addProduct(cheese);
		deal.addProduct(vinisko);
		deal.addProduct(ham);

//		System.out.println("printProducts: ");
//		
//		deal.printProducts();
//		System.out.println("--------------------------------");
		
		deal.deal();
		System.out.print("Deal DeadLinel: ");
		deal.deadLine();
		console.close();
	}

}
