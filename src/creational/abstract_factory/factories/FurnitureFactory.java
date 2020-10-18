package creational.abstract_factory.factories;

import creational.abstract_factory.furnitures.Furniture;
import creational.abstract_factory.furnitures.FurnitureType;

/**
 * @author orkungedik
 */
public interface FurnitureFactory {

    Furniture build(FurnitureType furnitureType);

}
