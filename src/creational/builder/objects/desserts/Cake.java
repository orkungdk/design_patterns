package creational.builder.objects.desserts;

/**
 * @author orkungedik
 */
public class Cake implements Dessert {

    @Override
    public String getDescription() {
        return "Chocolate cake";
    }

    @Override
    public double getCalories() {
        return 400;
    }

    @Override
    public double getPrice() {
        return 3;
    }
}
