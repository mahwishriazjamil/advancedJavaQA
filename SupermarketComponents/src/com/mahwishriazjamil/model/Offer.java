package com.mahwishriazjamil.model;

public class Offer {

    private int offerId;
    private String offerDescription;
    private String shortDescription;
    private boolean bogof;
    private boolean tftpot;
    private boolean isDiscounted;
    private double discountPercentage;

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public int getOfferId() {
        return offerId;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public boolean getBOGOF() {
        return bogof;
    }

    public void setBOGOF(boolean bogof) {
        this.bogof = bogof;
    }

    public boolean tftpot() {
        return tftpot;
    }

    public void setTFTPOT(boolean tftpot) {
        this.tftpot = tftpot;
    }

    public void setIsDiscounted(boolean isDiscounted) {
        this.isDiscounted = isDiscounted;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setOfferId(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
	
}
