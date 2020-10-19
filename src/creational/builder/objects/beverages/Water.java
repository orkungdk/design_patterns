package creational.builder.objects.beverages;

/**
 * @author orkungedik
 */
public class Water implements Beverage {

    @Override
    public String getAmount() {
        return "1 liter";
    }

    @Override
    public String getDescription() {
        return "Soft water";
    }

    @Override
    public double getCalories() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 0.5;
    }
}
