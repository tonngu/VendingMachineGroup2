package se.lexicon.group2.model;

import java.util.Arrays;

public class VendingMachineOrder implements VendingMachine {
    private Product[] products;
    private int depositPool;

    @Override
    public void addCurrency(CurrencyAmount) {
        depositPool = depositPool + CurrencyAmount;
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(Product id) {
        if(depositPool >= id.getPrice()){
            Product[] copiedProductsArray = new Product[products.length + 1];
            System.arraycopy(products, 0, copiedProductsArray, 0, products.length);
            copiedProductsArray[copiedProductsArray.length - 1] = id;
            products = copiedProductsArray;
            return id;
        }
        else throw new IllegalArgumentException("Not enough money added to the deposit pool.");
    }

    @Override
    public int endSession() {
        int currentDeposit = depositPool;
        depositPool = 0;
        return currentDeposit;
    }

    @Override
    public String getDescription(Product id) {
        return id.examine();
    }

    @Override
    public String[] getProducts() {
        return Arrays.copyOf[products,products.length];
    }
}
