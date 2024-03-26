package se.lexicon.group2;

import se.lexicon.group2.model.Coffee;
import se.lexicon.group2.model.VendingMachine;
import se.lexicon.group2.model.VendingMachineOrder;
import se.lexicon.group2.model.coffeeBrand;

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
        System.out.println(coffee.use());

        Coffee coffee2 = new Coffee(coffeeBrand.BOSS, true);
        System.out.println(coffee2.use());

        VendingMachineOrder order1 = new VendingMachineOrder();
        order1.addCurrency(50);
        order1.request(coffee);
        order1.request(coffee2);
        System.out.println(order1.getBalance());
        for (String productInfo : order1.getProducts()) {
            System.out.println(productInfo);
        }
    }
}
