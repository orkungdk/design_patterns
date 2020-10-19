package creational.builder.objects.beverages;

/**
 * @author orkungedik
 */
public class Cola implements Beverage {

    @Override
    public String getAmount() {
        return "0.75 litre";
    }

    @Override
    public String getDescription() {
        return "Soda";
    }

    @Override
    public double getCalories() {
        return 200;
    }

    @Override
    public double getPrice() {
        return 1;
    }
}
