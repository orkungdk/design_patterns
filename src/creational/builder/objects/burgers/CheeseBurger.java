package creational.builder.objects.burgers;

/**
 * @author orkungedik
 */
public class CheeseBurger implements Burger {

    @Override
    public String getBreadType() {
        return "Sesame hamburger bread";
    }

    @Override
    public String getDescription() {
        return "Delicious cheese burger.";
    }

    @Override
    public double getCalories() {
        return 500;
    }

    @Override
    public double getPrice() {
        return 12;
    }
}
