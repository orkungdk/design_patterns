package creational.factory_method.math.operation;

import creational.factory_method.math.Operand;

/**
 * @author orkungedik
 */
public interface Operation {

    double execute(Operand arg1, Operand arg2);
}
