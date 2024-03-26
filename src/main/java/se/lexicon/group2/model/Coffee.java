package se.lexicon.group2.model;

public class Coffee extends Product {
private boolean isCold;

public Coffee(coffeeBrand coffeeBrand, boolean isCold){
    super(coffeeBrand.getPrice(), coffeeBrand.getName());
    this.isCold = isCold;
}

@Override
public String examine(){
    return "Item: " + getProductName() + ", Price: SEK " + getPrice();
}



}
