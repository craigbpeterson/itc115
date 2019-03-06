
public class UseProduct {

	public static void main(String[] args) {

		Product shirt = new Product(1, "T-Shirt", 19.99, 12);
		Product pants = new Product(2, "Jeans", 39.99, 8);
		Product shoes = new Product(3, "Sneakers", 60, 7);
		Product hat = new Product(4, "Baseball Cap", 12.5, 22);
		
		//display results of product instantiation
		System.out.println("All product info:");
		System.out.println(shirt.toString());
		System.out.println(pants.toString());
		System.out.println(shoes.toString());
		System.out.println(hat.toString());
		
		//report on number of Product instantiations
		System.out.println();
		System.out.println("There are " + Product.getCount() + " objects of the Product class.");
	}

}
