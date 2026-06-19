/*
 * Name: Juliana Bruno
 * Project: 1
 * Title: productDriver.java
 * Summary: creates a product based on user information provided and checks if products are the same. outputs information to the console
 * Date: 2/8/25
 */

import java.util.Scanner;

public class productDriver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Product oranges = new Product("oranges", "1234", 2.99, 500);
		Product cereal = new Product("Chex Cereal", "5678", 3.99, 625);
		
		System.out.println("Welcome to the product program!");
		System.out.println("Two products are already added. Please provide information for the third product.");
		
		Product userProduct = new Product();
		System.out.println("Please enter the name of the product: ");
		userProduct.setName(keyboard.next());
		
		System.out.println("Please provide the SKU number of the product: ");
		userProduct.setSKU(keyboard.next());
		
		while (userProduct.isEqual(oranges) || userProduct.isEqual(cereal)) {
			System.out.println("Error. SKU number is already used. Please enter a unique SKU number: ");
			userProduct.setSKU(keyboard.next());
		}
		
		
		System.out.println("Please enter the price of the product: ");
		userProduct.setCost(keyboard.nextDouble());
		
		System.out.println("Please enter the quantity of the product: ");
		userProduct.setQuantity(keyboard.nextDouble());
		
		System.out.println("Third product created successfully.");
	
		System.out.println("Creating a new product that is a copy of oranges.");
		Product testProduct = new Product(oranges);
		
		System.out.println("Printing out all the products.");
		System.out.println("\n" + oranges);
		System.out.println("\n" + cereal);
		System.out.println("\n" + userProduct);
		System.out.println("\n" + testProduct);

		System.out.println("\nUpdating the quantity of testProduct.");
		testProduct.setQuantity(204);
		
		System.out.println("Printing out all the products.");
		System.out.println("\n" + oranges);
		System.out.println("\n" + cereal);
		System.out.println("\n" + userProduct);
		System.out.println("\n" + testProduct);
		
		System.out.println("\nThe total number of unique products is: " + Product.getTotalNumberOfProducts());
		
		System.out.println("Thank you for using the program! Good bye.");
		
		
		
/* Output:
 * 
 * 
Welcome to the product program!
Two products are already added. Please provide information for the third product.
Please enter the name of the product: 
apples
Please provide the SKU number of the product: 
1234
Error. SKU number is already used. Please enter a unique SKU number: 
5678
Error. SKU number is already used. Please enter a unique SKU number: 
7368
Please enter the price of the product: 
2.55
Please enter the quantity of the product: 
176
Third product created successfully.
Creating a new product that is a copy of oranges.
Printing out all the products.

Product Information: 
Name: oranges
SKU: 1234
Cost: $2.99
Quantity: 500.0

Product Information: 
Name: Chex Cereal
SKU: 5678
Cost: $3.99
Quantity: 625.0

Product Information: 
Name: apples
SKU: 7368
Cost: $2.55
Quantity: 176.0

Product Information: 
Name: oranges
SKU: 1234
Cost: $2.99
Quantity: 500.0

Updating the quantity of testProduct.
Printing out all the products.

Product Information: 
Name: oranges
SKU: 1234
Cost: $2.99
Quantity: 500.0

Product Information: 
Name: Chex Cereal
SKU: 5678
Cost: $3.99
Quantity: 625.0

Product Information: 
Name: apples
SKU: 7368
Cost: $2.55
Quantity: 176.0

Product Information: 
Name: oranges
SKU: 1234
Cost: $2.99
Quantity: 204.0

The total number of unique products is: 4
Thank you for using the program! Good bye.
 * 
 * 
 */
	}

}
