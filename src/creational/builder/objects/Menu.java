package creational.builder.objects;

import java.util.List;

/**
 * @author orkungedik
 */
public class Menu {

    private List<Item> items;

    public void displayItems() {
        for (Item item : items) {
            System.out.println("----------");
            System.out.println(item.getDescription());
            System.out.println("Cal: " + item.getCalories());
            System.out.println("Price" + item.getPrice());
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
