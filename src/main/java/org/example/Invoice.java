package org.example;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private int pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, int pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        if (quantity > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0;
        }
    }


    // Method to calculate invoice amount
    public int getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

