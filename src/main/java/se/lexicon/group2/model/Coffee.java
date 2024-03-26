package se.lexicon.group2.model;

public class Coffee extends Product {
private boolean isCold;

public Coffee(coffeeBrand brand, boolean isCold){
    super(brand.getPrice(), brand.getName());
    this.isCold = isCold;
}

@Override
public String examine(){
    return "{ " + "Name: " + getProductName() + ", Price: " + getPrice() + ", Cold: " + isCold + " , Id:" + getId()" }";
}

@Override
    public String use() {
    return "Item: " + getProductName() + ", Price: SEK " + getPrice() + ", Cold: " + isCold;
}

}
