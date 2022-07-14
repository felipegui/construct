package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	//Default builder
	public Product() {
		
	}
	
	//Custom constructor method
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Overload
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInSotck() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInSotck()); 
	}
	
}
