package creational.abstract_factory;

import creational.abstract_factory.factories.FurnitureFactory;
import creational.abstract_factory.factories.AbstractFactory;
import creational.abstract_factory.furnitures.Furniture;
import creational.abstract_factory.furnitures.FurnitureType;

/**
 * @author orkungedik
 */
public class Main {

    public static void main(String[] args) {
        // The created furniture will be a ...
        FurnitureFactory factory1 = AbstractFactory.getFactory(true); // ... classic furniture
        Furniture furniture1 = factory1.build(FurnitureType.CHAIR);            // ... chair
        System.out.println(furniture1.getLabel());

        // The created furniture will be a ...
        FurnitureFactory factory2 = AbstractFactory.getFactory(false); // ... modern furniture
        Furniture furniture2 = factory2.build(FurnitureType.TABLE);            // ... table
        System.out.println(furniture2.getLabel());
    }
}
