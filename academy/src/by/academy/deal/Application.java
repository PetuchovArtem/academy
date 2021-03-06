package by.academy.deal;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

//import testpackage.newDeal.DealDate;

public class Application {

	public static void main(String[] args) throws ParseException, IOException {

		boolean menu = true;
		int menuChoose;
		Scanner console = new Scanner(System.in);

		Product cheese = new Cheese(20, "Пармезан", "Итальянская сыроварня", 5, 20);
		Product vinisko = new Vinisko(30, "Шанет", "Минский ликероводоынй", 10, "triTopora");
		Product ham = new Ham(20, "Хамон", "ОАО ГрандСтройТрескМоллСырДеллХамВарПил", 2, 20);

		Person seller = new Person("ArtemSeller", "+375440000000", "testemail@gmail.com", 10000.00, "");
		Person buyer = new Person("ArtemBuyer", "+375440000000", "testemail@gmail.com", 10000.00, "");

		DealDateValidator date = new DealDateValidator();
		BelarusPhoneValidator q = new BelarusPhoneValidator();
		EmailValidator e = new EmailValidator();
		
		
		while (menu) {
			System.out.println("1: Валидация даты сделки: ");
			System.out.println("2: Валидация номера телефона: ");
			System.out.println("3: Deal: ");
			System.out.println("4: Валидация даты рождения покупателя: ");
			System.out.println("5: Валидация e-mail");
			System.out.println("6: Выход");

			menuChoose = console.nextInt();

			Deal deal = new Deal(seller, buyer);



			switch (menuChoose) {
			case 1:

				System.out.println("Введите дату, формат: dd/MM/yyyy либо dd-MM-yyyy: ");
				date.setDate(console.next());
				date.checkDate();
				break;
			case 2:
				System.out.println("Валидация номера телефона: " + q.validator(deal.getBuyer().getPhone()));
				System.out.println("--------------------------------");
				break;
			case 3:
				System.out.println("Deal: ");
				System.out.println("--------------------------------");

				deal.addProduct(cheese);
				deal.addProduct(vinisko);
				deal.addProduct(ham);
				deal.deleteProduct(0);

				System.out.println("printProducts: ");
				System.out.println("--------------------------------");
				deal.printProducts();

				deal.deal();
				deal.printBillinFile();
				System.out.println("--------------------------------");
				System.out.print("Deal DeadLinel: ");

				deal.deadLine();
				break;
			case 4:
				System.out.print("Введите дату рождения покупателя: ");
				String dateOfBirth = console.next();
				buyer.setDateOfBirth(dateOfBirth);
				date.setDate(buyer.getDateOfBirth());
				date.checkDate();
				break;
			case 5:
				System.out.print("Введите e-mail покупателя: ");
				String email = console.next();
				buyer.setEmail(email);
				System.out.println (e.validator(email));
				break;
			case 6:
				menu = false;
				System.out.println("------------------");
				System.out.println("Выход из меню");
				break;
			default:
				menu = false;
				System.out.println("------------------");
				System.out.println("Выход из меню");
				break;
			}

		}
		console.close();
	}
}
