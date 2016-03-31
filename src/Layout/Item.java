package Layout;

public class Item {

private String ID_ITEM;
private int quantity;
private double price;
	
public Item(String iD_ITEM, int quantity, double price) {
		
		ID_ITEM = iD_ITEM;
		this.quantity = quantity;
		this.price = price;
	}

public String getID_ITEM() {
		return ID_ITEM;
	}
	public void setID_ITEM(String iD_ITEM) {
		ID_ITEM = iD_ITEM;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "\n "+"Item id:" + ID_ITEM +" Item quantity:" + quantity +" Item price:" + price ;
	}
}
