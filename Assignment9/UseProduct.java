
public class UseProduct {

	public static void main(String[] args) {
		int totalProductCount = 0;
		
		Product shirt = new Product(1, "T-Shirt", 14.99, 12);
		totalProductCount += shirt.getProductCount();
		
		Product pants = new Product(2, "Jeans", 39.99, 8);
		totalProductCount += pants.getProductCount();
		
		Product shoes = new Product(3, "Hiking Boots", 80, 7);
		totalProductCount += shoes.getProductCount();

		//display results of product instantiation
		System.out.println("All product info:");
		System.out.println(shirt.toString());
		System.out.println(pants.toString());
		System.out.println(shoes.toString());
		
		//report quantity of entire inventory
		getCount(totalProductCount);
	}
	
	//prints a statement about the total quantity of items in the inventory
	public static void getCount(int totalProductCount) {
		System.out.println("The total quantity of items in the inventory: " + totalProductCount);
	}

}
