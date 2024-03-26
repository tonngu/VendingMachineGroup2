package se.lexicon.group2.model;

import se.lexicon.group2.model.Product;

import java.util.Arrays;

public class VendingMachineOrder implements VendingMachine {
    private Product[] products = new Product[0];
    private int depositPool; //shouldn't this be double instead of int?

    @Override
    public void addCurrency(int amount) {
        int[] allowedAmounts = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        int depositCheck = depositPool;
        for (int value : allowedAmounts) {
            if (amount == value) {
                depositPool = depositPool + amount;
            }
        }
        if (depositCheck == depositPool){
            throw new IllegalArgumentException("Only allowed amounts are: 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000)");
        }
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(Product id) {
        if (depositPool >= id.getPrice()) {
            depositPool = (int) (depositPool - id.getPrice()); //why according to UML product price is required to be double but deposits are int?
            Product[] copiedProductsArray = new Product[products.length + 1];
            System.arraycopy(products, 0, copiedProductsArray, 0, products.length);
            copiedProductsArray[copiedProductsArray.length - 1] = id;
            products = copiedProductsArray;
            return id;
        } else throw new IllegalArgumentException("Not enough money added to the deposit pool.");
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
        String[] getProductsArray = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            getProductsArray[i] = products[i].use();
        }
        return getProductsArray;
    }
}
