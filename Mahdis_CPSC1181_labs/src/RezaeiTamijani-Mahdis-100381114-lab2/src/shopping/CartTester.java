

public class CartTester {

	
	 public static void main(String[] args) {
		 
		 ShoppingCart myCart = new ShoppingCart();
		// bc there is not any constructo defined java gives defualt one 
		 // and we dont need to have construtor in the shopping cart bc we have additems, bc arraylist items is added in a method 
		 myCart.addItems();
		 Item.header();
		 myCart.displayItems();
		
		 myCart.totalPrice();
		
		 
		
	 }
}
