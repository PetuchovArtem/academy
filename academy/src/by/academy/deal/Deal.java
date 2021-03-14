package by.academy.deal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Deal {
	public final static int DEFAULT_PRODUCT_SIZE = 3;

	String date;
	Person seller;
	Person buyer;
	Product[] products;
	int productCounter;
	LocalDate deadlinDate;

	public Deal() {
		super();
	}

	public Deal(Person seller, Person buyer) {
		super();
		this.seller = seller;
		this.buyer = buyer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public void addProduct(Product product) {
		if (products == null) {
			products = new Product[DEFAULT_PRODUCT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = product;
	}

	public void deleteProduct(int index) {
		if (index > products.length || index < 0) {
			System.out.println("Index of bound");
			return;
		}
		if (productCounter != index) {
			System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
		}
		products[productCounter - 1] = null;
		productCounter--;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	private void printBill() {
		double summ = 0;
		System.out.println("Дата сделки " + DealDateValidator.getDate());
		System.out.println("--------------------------------");
		for (Product product : products) {
			if (product != null) {
				double totalProductPrice = product.calcFinalPrice();
				summ += totalProductPrice;
				System.out.println(product.getName() + " " + product.getPrice() + " X " + product.getQuantity() + " = "
						+ totalProductPrice + "(Скидка " + ((1 - product.disount()) * 100) + "%)");
			}
		}
		System.out.println("--------------------------------");
		System.out.println("Сумма " + summ);
		buyer.setMoney(buyer.getMoney() - summ);
		seller.setMoney(seller.getMoney() + summ);
				
	}
	
	public void printBillinFile() throws IOException {
		double summ = 0;
		File file = new File("DealBill.txt");
		file.createNewFile();
		try (FileWriter writer = new FileWriter(file)) {
			writer.write(("Дата сделки " + DealDateValidator.getDate()+"\n"));
			for (Product product : products) {
				if (product != null) {
					double totalProductPrice = product.calcFinalPrice();
					summ += totalProductPrice;
					writer.write(product.getName() + " " + product.getPrice() + " X " + product.getQuantity() + " = "
							+ totalProductPrice + "(Скидка " + ((1 - product.disount()) * 100) + "%)"+"\n");
								}
							}
			writer.write("\n" + "Сумма " + summ);		
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void printProducts() {
		for (int i = 0; i < productCounter; i++) {
			Product p = products[i];
			System.out.println("Наименование: " + p.getName());
			System.out.println("Производитель: " + p.getManufacture());
			System.out.println("Сумма сделки: " + p.calcFinalPrice());
			System.out.println("-----------------");
		}
	}

	public void deal() {
		double sum = 0;
		for (Product product : products) {
			if (product != null) {
				sum += product.calcFinalPrice() * product.getQuantity();
			}
		}
		if (sum > buyer.getMoney()) {
			System.out.println("Недостаточно денег ");
		} else {
			printBill();
		}
	}

	public void deadLine() {
		LocalDate today = LocalDate.now();
		deadlinDate = today.plusDays(10);
		System.out.println(deadlinDate);

	}
}
