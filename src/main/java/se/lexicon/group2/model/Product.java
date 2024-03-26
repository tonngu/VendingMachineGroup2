package se.lexicon.group2.model;

public abstract class Product {
private static int sequencer = 0;
private final int id;
private final double price;
private String productName;

    public Product(double price, String productName) {
        this.id = getNextId();
        this.price = price;
        this.productName = productName;
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
