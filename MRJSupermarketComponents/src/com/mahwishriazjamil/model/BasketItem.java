package com.mahwishriazjamil.model;

public class BasketItem {

    private String productName = null;
    private double latestPrice = 0.0;
    private int quantity = 0;

    public BasketItem(String productName, double latestPrice, int quantity) {
        this.productName = productName;
        this.latestPrice = latestPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(double latestPrice) {
        this.latestPrice = latestPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalOrder(){
        return latestPrice * quantity;
    }

    public void addItems(int number){
        this.setQuantity(quantity += number);
    }

}
