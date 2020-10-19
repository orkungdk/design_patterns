package creational.builder;

import creational.builder.builders.MenuBuilder;
import creational.builder.objects.Menu;

/**
 * @author orkungedik
 */
public class Main {

    public static void main(String[] args) {
        Menu dietMenu = MenuBuilder.prepareDietMenu();
        dietMenu.displayItems();

        Menu burgerMenu = MenuBuilder.prepareCheeseBurgerMenu();
        burgerMenu.displayItems();
    }
}
