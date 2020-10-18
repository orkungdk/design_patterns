package creational.abstract_factory.factories;

import creational.abstract_factory.furnitures.Furniture;
import creational.abstract_factory.furnitures.FurnitureType;
import creational.abstract_factory.furnitures.chairs.ClassicChair;
import creational.abstract_factory.furnitures.tables.ClassicTable;

/**
 * @author orkungedik
 */
public class ClassicFurnitureFactory implements FurnitureFactory {

    @Override
    public Furniture build(FurnitureType furnitureType) {
        switch (furnitureType) {
            case CHAIR:
                return new ClassicChair();
            case TABLE:
                return new ClassicTable();
            default:
                return null;
        }
    }
}
