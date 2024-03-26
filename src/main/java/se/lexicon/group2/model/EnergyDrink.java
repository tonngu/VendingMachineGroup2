package se.lexicon.group2.model;

public class EnergyDrink extends Product {
private boolean hasSugar;

    public EnergyDrink(EnergyDrinkBrand brand, boolean hasSugar){
        super(brand.getPrice(), brand.getName());
        this.hasSugar = hasSugar;
    }

    @Override
    public String examine(){
        return "{ " + "Name: " + getProductName() + ", Price: " + getPrice() + ", Sugar: " + hasSugar + " , Id:" + getId()+ " }";
    }

    @Override
    public String use() {
        return "Item: " + getProductName() + ", Price: SEK " + getPrice() + " , Id:" + getId();
    }

}

