package creational.factory_method.calculator;

/**
 * @author orkungedik
 */
public class Operand {

    double value;

    public Operand(String arg) {
        this.value = Double.valueOf(arg);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
