package creational.abstract_factory.factories;

/**
 * @author orkungedik
 */
public class AbstractFactory {

    public static FurnitureFactory getFactory(boolean isClassic) {
        return isClassic ? new ClassicFurnitureFactory() : new ModernFurnitureFactory();
    }
}
