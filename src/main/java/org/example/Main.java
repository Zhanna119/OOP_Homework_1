package org.example;

public class Main {
    public static void main(String[] args) {

        Invoice invoice = new Invoice("1234", "Item", 5, 100);

        // Printing the invoice details
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());

        // Updating quantity and price per item
        invoice.setQuantity(10);
        invoice.setPricePerItem(50);

        // Printing the updated invoice details
        System.out.println("\nUpdated Quantity: " + invoice.getQuantity());
        System.out.println("Updated Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Updated Invoice Amount: " + invoice.getInvoiceAmount());
    }
}