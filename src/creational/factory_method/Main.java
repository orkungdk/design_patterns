package creational.factory_method;

/**
 * @author orkungedik
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Factory Method implementation...");

        Calculator calculator = new Calculator();
        calculator.calculate("3 + 8");
        calculator.calculate("17 - 5");
        calculator.calculate("4 * 4");
        calculator.calculate("16 / 2");
    }
}
