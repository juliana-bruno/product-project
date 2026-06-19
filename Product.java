/*
 * Name: Juliana Bruno
 * Project: 1
 * Title: Product.java
 * Summary: outlines the details and method of a product
 * Date: 2/8/25
 */

public class Product {

	//instance variables
	private String name;
	private String SKU;
	private double cost;
	private double quantity;
	
	//static variable
	private static int totalNumberOfProducts = 0;
	
	//default constructor
	public Product() {
		name = "";
		SKU = "";
		cost = 0;
		quantity = 0;
		totalNumberOfProducts ++;
	}
	
	//overloaded constructor
	public Product(String n, String sku, double c, double q) {
		name = n;
		SKU = sku;
		cost = c;
		quantity = q;
		totalNumberOfProducts ++;
	}
	
	//copy constructor
	public Product(Product p) {
		this.name = p.getName();
		this.SKU = p.getSKU();
		this.cost = p.getCost();
		this.quantity = p.getQuantity();
		totalNumberOfProducts ++;
	}
	
	//get and set methods
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getSKU() {
		return SKU;
	}
	
	public void setSKU(String sku) {
		SKU = sku;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double c) {
		cost = c;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public void setQuantity(double q) {
		quantity = q;
	}
	
	//toString
	public String toString() {
		String x = "Product Information: \nName: " + name + "\nSKU: " + SKU + "\nCost: $" + cost + "\nQuantity: " + quantity;
		return x;
	}
	
	//equals method
	public boolean isEqual(Product p) {
		if (p.getSKU().equals(this.getSKU())) {
			return true;
		} else {
			return false;
		}
	}
	
	//static method
	public static int getTotalNumberOfProducts() {
		return totalNumberOfProducts;
	}
	
	
	
}
