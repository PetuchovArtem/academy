package by.academy.deal;

public class Cheese extends Product {

	Double weight;
	Integer age;

	Cheese() {
		super();
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
