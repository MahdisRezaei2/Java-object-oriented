

public class Item {
         
	// these are attributes of items 
	//in lab1 we didnt need setters for the id bc it was supposed to be generated
	 private String name;
	 private double unitprice;
	 private int quantity;
	 
	 // so this one is not the constructor?!!
	public Item(String name, double unitprice, int quantity) {
		this.name = name;
		this.unitprice = unitprice;
		this.quantity = quantity;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnitprice() {
		return unitprice;
	}


	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public static void header() {
		System.out.println("Shopping Cart");
		 System.out.println();
	    System.out.println("Item                    Unit Price    Quantity     Total\n" +
		                   "----------------------------------------------------------");
	}


	@Override
	public String toString() {
		return String.format("%-23s %-1s %-10.2f  %-13d %-1s %-2.2f ",name,"$",unitprice,quantity,"$",(unitprice*quantity));
	}
	
	
	 
}
