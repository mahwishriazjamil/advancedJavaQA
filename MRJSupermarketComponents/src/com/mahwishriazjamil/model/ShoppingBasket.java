package com.mahwishriazjamil.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingBasket extends SupermarketDataHarness {

	public static void main(String [ ] args) {
		ShoppingBasket basket = new ShoppingBasket();
		basket.addProduct(this.);
		basket.getBasketItems();
	}

	List<BasketItem> basketItems = new ArrayList<>();
	double basketTotal = 0.0;
	int numberOfItems = 0;
	private boolean BOGOF = false;
	private boolean TFTPOT = false;


	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public void addProduct(BasketItem item) {

		if ((!name.equals(null)) | (price != 0) | (quantity != 0)) {
			basketItems.add(item);
		} else {
			throw new NullPointerException("Name/price/quantity cannot be null!");
		}
	}

	public void removeProduct(String productName) {
		for (BasketItem item : this.basketItems) {
			if (item.getProductName().equals(productName)) {
				basketItems.remove(productName);
			} else {
				throw new IllegalArgumentException("Specified product doesn't exist!");
			}
		}
	}

	public void clearBasket() {
		this.basketItems.clear();
	}

	public List<BasketItem> getBasketItems() {
		return basketItems;
	}

	public double getBasketTotal(BasketItem basketItem) {
		double subTotal = 0.0;
		for (BasketItem item : this.basketItems) {
			subTotal += item.getLatestPrice();
		}
		return subTotal; // TODO


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

			for (Product item : this.basketItems) {

			}


		}
	}

}

























