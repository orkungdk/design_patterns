package creational.abstract_factory.factories;

import creational.abstract_factory.furnitures.Furniture;
import creational.abstract_factory.furnitures.FurnitureType;
import creational.abstract_factory.furnitures.chairs.ModernChair;
import creational.abstract_factory.furnitures.tables.ModernTable;

/**
 * @author orkungedik
 */
public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Furniture build(FurnitureType furnitureType) {
        switch (furnitureType) {
            case CHAIR:
                return new ModernChair();
            case TABLE:
                return new ModernTable();
            default:
                return null;
        }
    }
}
