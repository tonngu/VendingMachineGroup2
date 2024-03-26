package se.lexicon.group2.model;

public class Water extends Product {
private boolean isCarbonated;

    public Water(WaterBrand brand, boolean isCarbonated){
        super(brand.getPrice(), brand.getName());
        this.isCarbonated = isCarbonated;
    }

    @Override
    public String examine(){
        return "{ " + "Name: " + getProductName() + ", Price: " + getPrice() + ", Carbonated: " + isCarbonated + " , Id:" + getId()+ " }";
    }

    @Override
    public String use() {
        return "Item: " + getProductName() + ", Price: SEK " + getPrice() + " , Id:" + getId();
    }

}

