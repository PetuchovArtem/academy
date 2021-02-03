package by.academy.deal;

public class Vinisko extends Product {

	Double volume;
	Boolean status;

	Vinisko() {
		super();
	}

	public void Volume(double volume) {
		this.volume = volume;
	}

	public Boolean Status(Boolean status) {
		this.status = status;
		return status;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
