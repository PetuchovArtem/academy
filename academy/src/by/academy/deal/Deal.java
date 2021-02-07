package by.academy.deal;

public class Deal {

	public final static int DEFAULT_PRODUCT_SIZE = 2;
	Person seller;
	Person buyer;
	Product[] products;
	String dealDate;
	private int productCounter = 0;
	double summ = 0;

	Deal() {
		super();
	}

	public Deal(Person seller, Person buyer, String dealDate) {
		this.seller = seller;
		this.buyer = buyer;
		this.dealDate = dealDate;
	}

	public void checkBill() {
		for (Product product : products) {
			double totalProductPrice = product.getPrice() * product.getQuantity() * product.disount();
			summ += totalProductPrice;
			System.out.println("---");
			System.out.println("Имя: " + product.getName());
			System.out.println(
					"Стоимость за еденицу " + product.getPrice() + " Количество товара " + product.getQuantity());
			System.out.println("Итого по продукту " + totalProductPrice);
		}
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

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	public void printBill() {
		System.out.println("Сделка совершена " + dealDate);
		checkBill();
		System.out.println("-----------------------------------");
		System.out.println("Сумма всей сделки " + summ);
		buyer.setMoney(buyer.getMoney() - summ);
		seller.setMoney(seller.getMoney() + summ);
	}

	public void deal() {
		printBill();
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

	public String getDealDate() {
		return dealDate;
	}

	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}

}
