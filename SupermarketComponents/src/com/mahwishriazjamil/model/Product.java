package com.mahwishriazjamil.model;

public class Product {

		private int id;
	    private String name;
	    private double price;
	    private Offer offer;
	    
	    public Offer getOffers(){
	        return offer;
	    }
	    
	    public void setOffer(Offer offer){
	        this.offer = offer;
	    }
	    public double getPrice(){
	        return price;
	    }
	    public void setPrice(double price){
	        this.price = price;
	    }
	    public int getId() {
	        return id;
	    }
	
	    public void setId(int id) {
	        this.id = id;
	    }
	
	    public void setName(String name) {
	        this.name = name;
	    }
	
	    public String getName() {
	        return name;
	    }
	
}




















