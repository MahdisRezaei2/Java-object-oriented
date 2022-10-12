

import java.util.Scanner;
import java.util.ArrayList;

public class ShoppingCart {
      
	
	// we actually can remove the attributes, bc by the methods we have we are getting the attributes 
	// calculate the price of the items
	// shoping cart uses arraylist to add items
	 private int noItems;
	 private boolean isEmpty;
	 // always define the scanner in the calss not in the method
	 Scanner scan = new Scanner(System.in);
	 
	 private ArrayList<Item>  items = new ArrayList<Item>();
	 
	 public void addItems () {
		 System.out.println("keep mentioning the elements of the cart");
		 int flag = 1;
		 
		 while(flag==1) {
			 
			    System.out.println("do you like to add an item to the cart?Greater than equl to  1--yes, 0--no");
		    	flag = scan.nextInt();
			 
			 if(flag >=1) {
				 flag=1;
			 }
				 else {
					 flag=0;
					 break;
				 }
				 System.out.println("Enter an Item name");
				 // said a point about next and nextline
				 //
                 String name =  scan.nextLine();
                
                	 name=name+scan.nextLine();
             
				 
				 System.out.println("enter the item price");
				 double price = scan.nextDouble();
				 System.out.println("enter the quantity");
				 int quantity = scan.nextInt();
				
				 items.add(new Item(name, price, quantity) );
			 }
			 
			 
		 }
		
		 
		 //  anonymous class: we just use constructor no object name, bc we dont want to store it, we just want to add it  directly
	 public void noOfItems() {
		 System.out.println(items.size());
	 }
	 public void isEmpty() {
		 System.out.println(items.isEmpty());
	 }
	 
	 public void totalPrice() {
		 double price=0.0;
		 for (Item elem:items) {
			 price = price + elem.getUnitprice()*elem.getQuantity();
		 }
		 System.out.println();
		 System.out.println("Total price of the items: "+ price+" CAD");
	 }
	 public void displayItems() {
		 //calling arraylist diretly works, but only the data type in arraylist also has a method to display outputs, otherwise will just show the address
		 //bc its object not primitive data type,
		 //for primitive type there is tosirng automatically 
		 // so in item we generate tostring
		 //so this items will call items.tostring very important
//			System.out.println(items);
		 
		
		 for (int i =0; i <items.size();i++) {
			 System.out.println(items.get(i)+" ");
		 }
		 
		}
	
	 }
	 

