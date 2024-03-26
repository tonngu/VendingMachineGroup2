package se.lexicon.group2.model;

public abstract class Product {
private static int sequencer = 0;
private int id;
private double price;
private String productName;

    public Product(double price, String productName) {
        this.id = getNextId();
        this.productName = productName;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    private static int getNextId() {
    return ++sequencer;
    }

    public abstract String examine();

    public abstract String use();

}
