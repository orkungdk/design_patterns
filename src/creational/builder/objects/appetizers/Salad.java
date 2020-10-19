package creational.builder.objects.appetizers;

/**
 * @author orkungedik
 */
public class Salad implements Appetizer {

    @Override
    public String getDescription() {
        return "Health green salad";
    }

    @Override
    public double getCalories() {
        return 40;
    }

    @Override
    public double getPrice() {
        return 8;
    }
}
