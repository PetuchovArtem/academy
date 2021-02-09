package by.academy.homework.phone;

public class Main {

	public static void main(String[] args) {

		Phone phone1 = new Phone("375441111111", "iPhone1", 0.1);
		Phone phone2 = new Phone("375442222222", "iPhone2", 0.2);
		Phone phone3 = new Phone("375443333333", "iPhone3", 0.3);

		System.out.println(phone1.getModel() + " " + phone1.getNumber() + " " + phone1.getWeight());
		System.out.println(phone2.getModel() + " " + phone2.getNumber() + " " + phone2.getWeight());
		System.out.println(phone3.getModel() + " " + phone3.getNumber() + " " + phone3.getWeight());

		phone1.receiveCall("11111111111");
		phone2.receiveCall("22222222222");
		phone3.receiveCall("33333333333");

		phone1.getNumber("11111111111");
		phone2.getNumber("22222222222");
		phone3.getNumber("33333333333");

		Phone phone4 = new Phone();

		phone4.receiveCall("TestUser", "1111111111");
		phone4.sendMessage("7879798798", "5454949494", "562265461651", "28498489119");

	}

}
