package by.academy.deal;

public class Cheese extends Product {

	Double weight;
	Boolean blue;

	public void Weight(double weight) {
		this.weight = weight;
	}

	public Boolean Blue(Boolean blue) {
		this.blue = blue;
		return blue;
	}

}
