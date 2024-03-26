package se.lexicon.group2.model;

public enum WaterBrand {

    EVIAN(10, "Evian Mineral Water"),
    FIJI(12, "Fiji Natural Artesian Water"),
    AQUAFINA(12, "Aquafina Purified Still Water");

    private final double price;
    private final String name;

    WaterBrand(double price, String name) {
        this.price = price;
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
