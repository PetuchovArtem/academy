package by.academy.classwork.lesson15;

import java.util.regex.Pattern;

//1.	Создать статический метод который принимает на вход три параметра: login, 
//password и confirmPassword. Login должен содержать только латинские буквы, цифры 
//и знак подчеркивания. Длина login должна быть меньше 20 символов. Если login не 
//соответствует этим требованиям, необходимо выбросить WrongLoginException. Password 
//должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password 
//должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо выбросить 
//WrongPasswordException.  WrongPasswordException и WrongLoginException - 
//пользовательские классы исключения с двумя конструкторами – один по умолчанию, 
//второй принимает сообщение исключения и передает его в конструктор класса Exception. 
//Обработка исключений проводится внутри метода. Используем multi-catch block. 
//Метод возвращает true, если значения верны или false в другом случае. 

public class Main {
	
	
	
	public static void main(String[] args) {
		
		try {
			ClassForException("123456789012345678901234567890", "1234567890", "1234567890");			
		} catch (WrongLoginException e) {
			System.out.println("Перехваченное исключение." + e);
		}
		
	}

	public static void ClassForException(String login, String password, String confirmPassword)
			throws WrongLoginException {

		Pattern pattern = Pattern.compile("^([\\d\\w_]+");

		int a = login.length();
		if (a > 20) {
			throw new WrongLoginException("Пароль должен быть больше 20 символов");
		}
		if (pattern.matcher(login).matches() != true) {
			throw new WrongLoginException("В пароле введены неверные символы");
		}

	}

}
