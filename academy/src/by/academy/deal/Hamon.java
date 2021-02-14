package by.academy.deal;

public class Hamon extends Product {
	
	Double weight;
	private Integer age;
	
	public Hamon(double price, String name, String manufacture, int quantity, Integer age) {
		super(name, price, manufacture, quantity);
		this.age = age;
	}

	// create discount for Hamon
	@Override
	public double disount() {
		if (age > 20) {
			disount = 1 - 0.3;
		}
		return disount;
	}

	public void Weight(double weight) {
		this.weight = weight;
	}

	public void Age(Integer age) {
		this.age = age;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}