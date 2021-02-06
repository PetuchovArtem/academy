package by.academy.deal;

public class Vinisko extends Product {

	Double volume;
	String color;

	Vinisko() {
		super();
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
