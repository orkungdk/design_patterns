package creational.factory_method.math.operation;

/**
 * @author orkungedik
 */
public class OperationFactory {

    public static Operation invoke(String operation) {
        switch (operation) {
            case "+":
                return new Addition();
            case "-":
                return new Subtraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            default:
                return null;
        }

    }
}
