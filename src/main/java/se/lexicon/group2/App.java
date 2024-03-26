package se.lexicon.group2;

import se.lexicon.group2.model.*;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Coffee coffee = new Coffee(coffeeBrand.KONA, true);

        Coffee coffee2 = new Coffee(coffeeBrand.BOSS, true);

        EnergyDrink energyDrink = new EnergyDrink(EnergyDrinkBrand.REDBULL, true);

        Water water = new Water(WaterBrand.FIJI, true);

        VendingMachineOrder order1 = new VendingMachineOrder();
        order1.addCurrency(200);

        System.out.println("Initial balance: " + order1.getBalance() + " SEK");

        System.out.println("Purchased items:");

        order1.request(coffee);
        order1.request(coffee2);
        order1.request(energyDrink);
        order1.request(water);

        for (String productInfo : order1.getProducts()) {
            System.out.println(productInfo);
        }

        System.out.println("Remaining balance: " + order1.getBalance() + " SEK");
    }
}
