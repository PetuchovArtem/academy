package testpackage.newDeal;

public class Application {

	public static void main(String[] args) {
	
		Product firstProd = new Product("Чипсы", 1, 20);
		Product secondProd = new Product("Пиво", 2, 10);
		
		Product firstVine = new Vine("Шардоне", 4, 20, "red");
		
		Product p = new Product("Пиво", 2, 10);
		
		Deal deal1= new Deal("07-02-2021", 0);
		
				
//		firstProd.printProduct();
//		secondProd.printProduct();
//		firstVine.printProduct();
		
		
//					
		deal1.deal();
		firstProd.calcProduct();
		secondProd.calcProduct();
		firstVine.calcProduct();
		System.out.println("-----------------------------------------");

		
		
		deal1.addProduct1(p);
		System.out.println(firstProd.calcProduct()+firstVine.calcProduct()+secondProd.calcProduct());
			
		
		}

}
