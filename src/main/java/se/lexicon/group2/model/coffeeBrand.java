package se.lexicon.group2.model;

public enum coffeeBrand {
    BOSS(15, "BOSS Canned Coffee"),
    KONA(17, "KONA Canned Coffee with Milk"),
    HIGHBREW(15, "HIGHBREW Canned Coffee Sugar Free");

    private final double price;
    private final String name;

    coffeeBrand(double price, String name){
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
