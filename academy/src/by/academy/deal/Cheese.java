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

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Boolean getBlue() {
		return blue;
	}

	public void setBlue(Boolean blue) {
		this.blue = blue;
	}

}
