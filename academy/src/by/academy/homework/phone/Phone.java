package by.academy.homework.phone;

import java.util.Arrays;

public class Phone {

	protected String number;
	protected String model;
	protected Double weight;
	protected String callNumber;
	protected String name;
	String[] phoneNumbers;

	Phone() {
		super();
	}

	Phone(String number, String model, Double weight) {
		this(number, model);
		this.weight = weight;
	}

	Phone(String number, String model) {
		this.number = number;
		this.model = model;
	}

	public void receiveCall(String name) {
		this.name = name;
		System.out.println("Звонит " + name);
	}

	public void receiveCall(String name, String callNumber) {
		this.name = name;
		this.callNumber = callNumber;
		System.out.println("Звонит " + name + " " + callNumber);
	}

	public void sendMessage(String... phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
		StringBuilder builder = new StringBuilder();
		builder.append("Номера для отправки смс: ");
		builder.append(Arrays.toString(phoneNumbers));
		System.out.println(builder);
	}

	public String getNumber(String callNumber) {
		return callNumber;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

}
