package testpackage.newDeal;

public class Product {

	String name;
	int quantity;
	double price;
	
	
	Product (String name,int quantity, int price){
		this.name=name;
		this.quantity=quantity;
		this.price = price;
	}
	
	public void printProduct() {
		System.out.println("Имя: "+ name + " Количество: "+ quantity+ " Цена: "+ price);
		
	}	
	
	public double calcProduct () {
		double calcTotalPrice;
		double totalPrice=0;
		
		if (price>=10) {
			totalPrice = price*0.8+2;
		}
	
		calcTotalPrice = totalPrice* quantity;
		System.out.println("Имя: "+ name + " Количество: "+ quantity+ " Итоговая цена: "+ calcTotalPrice);

		return totalPrice;
	}
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
 

}
