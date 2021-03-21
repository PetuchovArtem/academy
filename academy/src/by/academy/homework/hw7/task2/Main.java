package by.academy.homework.hw7.task2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User ArtemUser = new User("LoginTest", "PasswordTest", "emailTest");
		ArtemUser.setFirstName("Artiom");
		ArtemUser.setLastName("Petukhou");
		ArtemUser.setAge(23);
		ArtemUser.setDateOfBirth("07041997");
		
		System.out.println (ArtemUser.printUserInfo());
		
		
		
	}

}
