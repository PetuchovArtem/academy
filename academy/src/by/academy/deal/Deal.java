package by.academy.deal;

public class Deal {
	
	public final static int DEFAULT_PRODUCT_SIZE = 2;
	Person seller;
	Person buyer;
	Product[] products;
	String dealDate;
	double price = 0;
	private int productCounter=0;

	Deal() {
		super();
	}

	public Deal(Person seller, Person buyer, String dealDate) {
		this.seller = seller;
		this.buyer = buyer;
		this.dealDate = dealDate;
	}

	public double checkBill() {
		double checkSum = 0.0;
		for (Product tmp : products) {
			System.out.println(tmp.getName());
			checkSum += tmp.getPrice() * tmp.disount() * tmp.getQuantity();
		}
		return checkSum;
	}

	public void addProducts(Product product) {
		
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
	
	
	
	private void printBill() {
		double summ = 0;
		System.out.println("Сделка совершена ");
		for (Product product : products) {
			double totalProductPrice = product.getPrice() * product.getQuantity();
			summ += totalProductPrice;
			System.out.println("Имя: " + product.getManufacture() + " " + product.getPrice() + "X"
					+ product.getQuantity() + "=" + totalProductPrice);
		}
		System.out.println("Сумма всей сделки " + summ);
		buyer.setMoney(buyer.getMoney() - summ);
		seller.setMoney(seller.getMoney() + summ);
		System.out.println("Деньги покупателя " + buyer.getMoney());
		System.out.println("Деньги продавца " + seller.getMoney());

	}
	
	
	public void deal() {
		double sum = 0;
		for (Product product : products) {
			sum += product.getPrice() * product.getQuantity();
		}
		if (sum > buyer.getMoney()) {
			System.out.println("Недостаточно средств! ");
		} else {
			printBill();
		}
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
