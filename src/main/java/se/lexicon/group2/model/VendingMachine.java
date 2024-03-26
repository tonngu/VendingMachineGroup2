package se.lexicon.group2.model;

public interface VendingMachine {
void addCurrency(int amount);
int getBalance();
Product request(Product id);
int endSession();
String getDescription(Product id);
String[] getProducts();
}
