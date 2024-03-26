package se.lexicon.group2;

import se.lexicon.group2.model.Coffee;
import se.lexicon.group2.model.VendingMachine;
import se.lexicon.group2.model.VendingMachineImpl;
import se.lexicon.group2.model.coffeeBrand;

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

    }
}
