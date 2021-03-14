package by.academy.homework.hw6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Создайте класс User с полями Имя, Фамилия, Возраст и 
//конструктором(Имя, Фамилия, Возраст). В классе Main создайте ArrayList<User>, 
//добавьте 10 пользователей в коллекцию. Создайте каталог(папку) users и для 
//каждого пользователя создайте файл в этом каталоге. Назовите 
//файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в файл 
//пользователя. Не забываем закрывать потоки. В блоке catch выводим сообщение 
//ошибки на экран (System.err.println(e.getMessage());)

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("User1", "Papa1", 1));
		users.add(new User("User2", "Papa2", 2));
		users.add(new User("User3", "Papa3", 3));
		users.add(new User("User4", "Papa4", 4));
		users.add(new User("User5", "Papa5", 5));
		users.add(new User("User6", "Papa6", 6));
		users.add(new User("User7", "Papa7", 7));
		users.add(new User("User8", "Papa8", 9));
		users.add(new User("User9", "Papa9", 9));
		users.add(new User("User10", "Papa10", 10));

		File dir = new File("users");
		if (!dir.exists()) {
			dir.mkdir();
		}

		for (User user : users) {
			String fileUserName = user.getName() + "_" + user.getSurname() + ".txt";
			File userFile = new File(dir, fileUserName);
			try (ObjectOutputStream objectStram = new ObjectOutputStream(new FileOutputStream(userFile))) {
				objectStram.writeObject(user);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Запись users завершена");

	}

}
