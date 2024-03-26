package se.lexicon.group2.model;

public enum EnergyDrinkBrand {
    REDBULL(15, "Redbull Energy Drink"),
    CELCIUS(17, "Celcius Canned Coffee with Milk"),
    MONSTER(15, "Monster Energy Drink");

    private final double price;
    private final String name;

    EnergyDrinkBrand(double price, String name){
        this.price = price;
        this.name = name;
    }


    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
