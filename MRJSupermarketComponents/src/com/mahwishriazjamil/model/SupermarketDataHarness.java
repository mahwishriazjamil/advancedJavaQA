/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mahwishriazjamil.model;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author Riaz-JamilM
 */
public class SupermarketDataHarness {

	List<BasketItem> basket = new ArrayList<>();
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
//You will need to expand this example to get 
        //A BOGOF Offer
        Offer bogofOffer = new Offer();
        bogofOffer.setOfferId(1);
        bogofOffer.setBOGOF(true);
        bogofOffer.setTFTPOT(false);
        bogofOffer.setOfferDescription("Buy one get one free");
        bogofOffer.setShortDescription("BOGOF");
        bogofOffer.setIsDiscounted(false);

        //TODO add all the other offers here
        Offer tftpotOffer = new Offer();
        tftpotOffer.setOfferId(2);
        tftpotOffer.setTFTPOT(true);
        tftpotOffer.setOfferDescription("Three for the price of two");
        tftpotOffer.setShortDescription("TFTPOT");
        tftpotOffer.setIsDiscounted(false);

        //A BasketItem with a BOGOF offer
        BasketItem beans0 = new BasketItem();
        beans0.setProductName("Baked Beans");
        beans0.setLatestPrice(0.56);
        beans0.setQuantity(1);

        BasketItem cornflakes0 = new BasketItem();
        cornflakes0.setProductName("Corn Flakes");
        cornflakes0.setLatestPrice(2.22);
        cornflakes0.setQuantity(1); // tftpot
        
        //TODO add all the other BasketItems here
        BasketItem beans1 = new BasketItem();
        beans1.setId(3);
        beans1.setPrice(0.56);
        beans1.setOffer(bogofOffer);
        beans1.setName("Baked Beans"); 
        beans1.setOffer(bogofOffer); // BOGOF free

        BasketItem cornflakes1 = new BasketItem();
        cornflakes1.setId(4);
        cornflakes1.setPrice(2.22);
        cornflakes1.setOffer(null);
        cornflakes1.setName("Corn Flakes"); // tftpot

        BasketItem cornflakes2 = new BasketItem();
        cornflakes2.setId(5);
        cornflakes2.setPrice(2.22);
        cornflakes2.setOffer(null);
        cornflakes2.setName("Corn Flakes");
        cornflakes2.setOffer(tftpotOffer);// TFTPOT free

        BasketItem eggs = new BasketItem();
        eggs.setId(6);
        eggs.setPrice(1.24);
        eggs.setOffer(null);
        eggs.setName("Eggs");

        //This dictionary will store all our BasketItems and their offers. We will use it as our in-memory database
        Dictionary<Integer, BasketItem> allBasketItemsAndOffer = new Hashtable<>();
        allBasketItemsAndOffer.put(1, beans0);
        allBasketItemsAndOffer.put(2, beans1);
        allBasketItemsAndOffer.put(3, cornflakes0);
        allBasketItemsAndOffer.put(4, cornflakes1);
        allBasketItemsAndOffer.put(5, cornflakes2);
        allBasketItemsAndOffer.put(6, eggs);

        // adding BasketItems to the basket
        List<BasketItem> basket = new ArrayList<>();
        basket.add(allBasketItemsAndOffer.get(1));
        basket.add(allBasketItemsAndOffer.get(2));
        basket.add(allBasketItemsAndOffer.get(3));
        basket.add(allBasketItemsAndOffer.get(4));
        basket.add(allBasketItemsAndOffer.get(5));
        basket.add(allBasketItemsAndOffer.get(6));
        
        // displaying BasketItems in the basket
        for (BasketItem item : basket) {
        	System.out.println(item);
        }
        
        // displaying basket total 
		for (BasketItem item : basket) {
			double subTotal = 0.0;
			subTotal += item.getPrice();
			System.out.println(subTotal);
		}
		
		
		
    }
    
	public void clearBasket() {
		this.basket.clear();

	}



}





























