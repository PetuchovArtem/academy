package by.academy.deal;

public class Cheese extends Product {

	Double weight;
	private Integer age;

	public Cheese(double price, String name, String manufacture, int quantity, Integer age) {
		super(name, price, manufacture, quantity);
		this.age = age;
	}
 
	// create discount for cheese
	@Override
	public double disount() {
		if (age > 20) {
			disount = 1 - 0.2;
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
