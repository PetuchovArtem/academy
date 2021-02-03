package by.academy.deal;

public class Cheese extends Product {

	Double weight;
	Boolean blue;

	Cheese() {
		super();
	}

	public void Weight(double weight) {
		this.weight = weight;
	}

	public Boolean Blue(Boolean blue) {
		this.blue = blue;
		return blue;
	}

}
