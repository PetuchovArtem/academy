package testpackage.newDeal;

public class Application {

	public static void main(String[] args) {
	
		Product firstProd = new Product("Чипсы", 1, 20);
		Product secondProd = new Product("Пиво", 2, 10);
		
		Vine firstVine = new Vine("Шардоне", 4, 20, "red");
		
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

		
		
		
		System.out.println(firstProd.calcProduct()+firstVine.calcProduct()+secondProd.calcProduct());
			
		
		}

}
