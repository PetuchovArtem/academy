package by.academy.classwork.lesson12;

public class User {

	private static String login;
	private static String password;

	public static final Printable p = new Printable() {

		@Override
		public void print() {
			System.out.println("Interface Override");
		}
	};

	public User(String login, String password) {
		super();
		User.login = login;
		User.password = password;
	}

	public void createQuery() {
		Query.printToLog();
	}

	public User() {
		super();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		User.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		User.password = password;
	}

	public static class Query {

		public static void printToLog() {
			System.out.println("User login: " + User.login);
			System.out.println("User password: " + User.password);
			p.print();
		}

	}

}
