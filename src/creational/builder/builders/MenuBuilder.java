package creational.builder.builders;

import creational.builder.objects.Menu;
import creational.builder.objects.appetizers.Appetizer;
import creational.builder.objects.appetizers.Chips;
import creational.builder.objects.appetizers.Salad;
import creational.builder.objects.beverages.Beverage;
import creational.builder.objects.beverages.Cola;
import creational.builder.objects.beverages.Water;
import creational.builder.objects.burgers.Burger;
import creational.builder.objects.burgers.CheeseBurger;
import creational.builder.objects.burgers.LavashBurger;
import creational.builder.objects.desserts.Cake;
import creational.builder.objects.desserts.Dessert;

import java.util.Arrays;

/**
 * @author orkungedik
 */
public class MenuBuilder {

    public static Menu prepareDietMenu() {
        Menu menu = new Menu();

        Burger burger = new LavashBurger();
        Beverage beverage = new Water();
        Appetizer appetizer =  new Salad();

        menu.setItems(Arrays.asList(burger, beverage, appetizer));

        return menu;
    }

    public static Menu prepareCheeseBurgerMenu() {
        Menu menu = new Menu();

        Burger burger = new CheeseBurger();
        Beverage beverage = new Cola();
        Appetizer appetizer =  new Chips();
        Dessert dessert = new Cake();

        menu.setItems(Arrays.asList(burger, beverage, appetizer, dessert));

        return menu;
    }

}
