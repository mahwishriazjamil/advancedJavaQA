/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mahwishriazjamil.model;

import com.mahwishriazjamil.model.Offer;
import com.mahwishriazjamil.model.Product;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author Riaz-JamilM
 */
public class SupermarketDataHarness {

	List<Product> basket = new ArrayList<>();
	
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

        //A product with a BOGOF offer
        Product beans0 = new Product();
        beans0.setId(1);
        beans0.setPrice(0.56);
        beans0.setOffer(bogofOffer);
        beans0.setName("Baked Beans");

        Product cornflakes0 = new Product();
        cornflakes0.setId(2);
        cornflakes0.setPrice(2.22);
        cornflakes0.setOffer(null);
        cornflakes0.setName("Corn Flakes"); // tftpot
        
        //TODO add all the other products here
        Product beans1 = new Product();
        beans1.setId(3);
        beans1.setPrice(0.56);
        beans1.setOffer(bogofOffer);
        beans1.setName("Baked Beans"); 
        beans1.setOffer(bogofOffer); // BOGOF free

        Product cornflakes1 = new Product();
        cornflakes1.setId(4);
        cornflakes1.setPrice(2.22);
        cornflakes1.setOffer(null);
        cornflakes1.setName("Corn Flakes"); // tftpot

        Product cornflakes2 = new Product();
        cornflakes2.setId(5);
        cornflakes2.setPrice(2.22);
        cornflakes2.setOffer(null);
        cornflakes2.setName("Corn Flakes");
        cornflakes2.setOffer(tftpotOffer);// TFTPOT free

        Product eggs = new Product();
        eggs.setId(6);
        eggs.setPrice(1.24);
        eggs.setOffer(null);
        eggs.setName("Eggs");

        //This dictionary will store all our products and their offers. We will use it as our in-memory database
        Dictionary<Integer, Product> allProductsAndOffer = new Hashtable<>();
        allProductsAndOffer.put(1, beans0);
        allProductsAndOffer.put(2, beans1);
        allProductsAndOffer.put(3, cornflakes0);
        allProductsAndOffer.put(4, cornflakes1);
        allProductsAndOffer.put(5, cornflakes2);
        allProductsAndOffer.put(6, eggs);

        // adding products to the basket
        List<Product> basket = new ArrayList<>();
        basket.add(allProductsAndOffer.get(1));
        basket.add(allProductsAndOffer.get(2));
        basket.add(allProductsAndOffer.get(3));
        basket.add(allProductsAndOffer.get(4));
        basket.add(allProductsAndOffer.get(5));
        basket.add(allProductsAndOffer.get(6));
        
        // displaying products in the basket
        for (Product item : basket) {
        	System.out.println(item);
        }
        
        // displaying basket total 
		for (Product item : basket) {
			double subTotal = 0.0;
			subTotal += item.getPrice();
			System.out.println(subTotal);
		}
		
		
		
    }
    
	public void clearBasket() {
		this.basket.clear();

	}



}





























