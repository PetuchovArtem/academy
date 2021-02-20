package by.academy.classwork.lesson12;

public interface Printable {
	
	public default void print() {
		System.out.println("Interface");
	}

}
