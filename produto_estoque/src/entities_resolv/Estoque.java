package entities_resolv;

public class Estoque {
	
	 public String name;
	 public double price;
	 public int quantity;
	 
	 
	 public double totalValueInStock() {
	   return price * quantity;
	}
	 
	public void addProducts(int quantity) {
	   this.quantity += quantity;
	  }
	
	public void removeProducts(int quantity) {
	   this.quantity -= quantity;
	}
	
	public String toString() {
	return name
	+ ", $ "
	+ String.format("%.2f", price)
	+ ", "
	+ quantity
	+ " unidades, Total: $ "
	+ String.format("%.2f", totalValueInStock());
	}
}
