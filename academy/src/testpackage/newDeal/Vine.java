package testpackage.newDeal;

public class Vine extends Product {
	
	String color;

	
	
	Vine(String name, int quantity, int price, String color) {
		super(name, quantity, price);
		this.color=color;
		} 
	
	@Override	
	public double calcProduct () {
		double calcTotalPrice=0;
		double totalPrice=0;
		
		if (color.equals("red")) {
			totalPrice = price*2;
		}
		calcTotalPrice = totalPrice* quantity;
		System.out.println("Имя: "+ name + " Количество: "+ quantity+ " Итоговая цена: "+ calcTotalPrice);

		return calcTotalPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

}
