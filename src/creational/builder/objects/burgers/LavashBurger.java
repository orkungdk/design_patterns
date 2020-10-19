package creational.builder.objects.burgers;

/**
 * @author orkungedik
 */
public class LavashBurger implements Burger {

    @Override
    public String getBreadType() {
        return "Turkish lavash";
    }

    @Override
    public String getDescription() {
        return "Low cal lavash burger.";
    }

    @Override
    public double getCalories() {
        return 90;
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
