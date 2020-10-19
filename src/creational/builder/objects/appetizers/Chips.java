package creational.builder.objects.appetizers;

/**
 * @author orkungedik
 */
public class Chips implements Appetizer {

    @Override
    public String getDescription() {
        return "Fried potatoes";
    }

    @Override
    public double getCalories() {
        return 300;
    }

    @Override
    public double getPrice() {
        return 3;
    }
}
