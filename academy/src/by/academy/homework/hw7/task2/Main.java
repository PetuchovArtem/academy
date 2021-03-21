package by.academy.homework.hw7.task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User ArtemUser = new User("LoginTest", "PasswordTest", "emailTest");
		ArtemUser.setFirstName("Artiom");
		ArtemUser.setLastName("Petukhou");
		ArtemUser.setAge(23);
		ArtemUser.setDateOfBirth("07041997");
		
		System.out.println (ArtemUser.printUserInfo());
		
		Class<? extends User> userClass = User.class;
		
		//getDeclaredField("name")
		try {
			Field loginField = userClass.getDeclaredField("login");
			String loginValue = (String) loginField.get(ArtemUser);
			System.out.println(loginValue); 
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		//getDeclaredFields()
		Field[] declaredFields = userClass.getDeclaredFields();

		for (Field field : declaredFields) {
			System.out.println(field);
		}

		
				
	}

}

//getMethod("name")
//getMethods()
//getField("name")
//getFields()
//а затем через 
//getDeclaredMethod("name")
//getDeclaredMethods()
//getDeclaredField("name")
//getDeclaredFields()
