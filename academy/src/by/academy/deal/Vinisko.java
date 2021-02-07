package by.academy.deal;

public class Vinisko extends Product {

	Double volume;
	private String color;

	public Vinisko(double price, String name, String manufacture, int quantity, String color) {
		super(name, price, manufacture, quantity);
		this.color = color;
	}
	
	// create discount for Vinisko
	@Override
	public double disount() {
		if (color.equals("red")) {
			disount = 1 - 0.17;
		} else if (color.equals("white")) {
			disount = 1 - 0.1;
		} else if (color.equals("triTopora")) {
			disount = 1 - 0.5;
		}

		return disount;
	}

	public void Volume(double volume) {
		this.volume = volume;
	}

	public void Color(String color) {
		this.color = color;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
