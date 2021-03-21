package by.academy.homework.hw7.task2;

//b)	Добавить класс User, который наследуется от Person, с полями: login, password, email
//c)	Добавить гетеры, сетеры. Добавить метод printUserInfo в User. 
//Вывести с помощью рефлексии все поля и методы, сначала через

public class User extends Person {

	public String login;
	private String password;
	public String email;

	public User() {
		super();
	}

	public User(String login, String password, String email) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String printUserInfo() {
		return "User [login=" + login + ", password=" + password + ", email=" + email + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", dateOfBirth=" + dateOfBirth + "]";
	}
	

}
