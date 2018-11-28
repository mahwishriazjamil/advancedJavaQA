package com.mahwishriazjamil.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket extends Offer{
	
//	public static void main(String [ ] args) {
//		ShoppingBasket basket = new ShoppingBasket();
//		basket.addProduct("Eggs", 2.0, 1);
//		basket.getBasketItems();
//	}
	
	List<Product> basketItems = new ArrayList<>();
	double basketTotal = 0.0;
	int numberOfItems = 0;
	private boolean BOGOF = false; 
	private boolean TFPOT = false; 
	
	public void addProduct(String name, double price, int quantity) {
		Product myBasketItem = new Product(name, price, quantity);
		if ((name.equals(null)) | (price != 0) | (quantity != 0)) {
			this.basketItems.add(myBasketItem);
		}
		else {
			throw new NullPointerException("Name/price/quantity cannot be null!");
		}
	}
	
	public void removeProduct(String productName) {
		for (Product item : this.basketItems) {
			if (item.getProductName().equals(productName)){
				basketItems.remove(productName);
			}
			else {
				throw new IllegalArgumentException("Specified product doesn't exist!");
			}
		}
	}
	
	public void clearBasket() {
		this.basketItems.clear();
	}
	
	public List<Product> getBasketItems() {
		return basketItems;
	}
	
	public double getBasketTotal(Product basketItem) {
		double subTotal = 0.0;
		for (Product item : this.basketItems) {
			subTotal += item.getLatestPrice();
		}
		return subTotal; // TODO
	}
	
	@Override
	public void applyDiscount() {
		String itemName = null;
		int BOGOFCounter = 0;
		
		// apply BOGOF discount
		for (Product item : this.basketItems) {
			itemName = item.getProductName();
			if (itemName.equals(item.getProductName())) {
				BOGOF = true;
				BOGOFCounter++;
			}
		}
		
		for (Product item: this.basketItems) {
			
		}
		
	}
	
	

	
}

























