package testpackage.newDeal;

import by.academy.deal.Product;

public class Deal {
	Product[] products; 
	String date;
	double totalDealPrice=0;
	int productCounter=0;
	public final static int DEFAULT_PRODUCT_SIZE = 2;
	
	
	Deal (String date, double totalDealPrice){
		this.date=date;
		this.totalDealPrice=totalDealPrice;
	}
	
	
	
	
	
	
	public void addProduct1(Product p) {

		if (products == null) {
			products = new Product[DEFAULT_PRODUCT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = p;
		System.out.println(p.getName());
	}

	
	
	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
		
	}
	
	
	
	
	public void deal () {
		System.out.println("Дата сделки: "+date);
			
	}

	public void calculate (Product) {
		double checkSum=0;
		for (Product tmp : products) {
			System.out.println(tmp.getName());
			checkSum += tmp.getPrice() * tmp.disount() * tmp.getQuantity();
		}
			System.out.println ("Цена " + checkSum);
			}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getTotalDealPrice() {
		return totalDealPrice;
	}

	public void setTotalDealPrice(double totalDealPrice) {
		this.totalDealPrice = totalDealPrice;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
	
}
