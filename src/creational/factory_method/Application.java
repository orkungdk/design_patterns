package creational.factory_method;

import creational.factory_method.math.Calculator;

/**
 * @author orkungedik
 */
public class Application {

    public static void main(String[] args) {
        System.out.println("Factory Method implementation...");

        Calculator calculator = new Calculator();
        calculator.calculate("3 + 8");
        calculator.calculate("17 - 5");
        calculator.calculate("4 * 4");
        calculator.calculate("16 / 2");
    }
}
