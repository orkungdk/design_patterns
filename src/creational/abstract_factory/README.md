### Abstract Factory Method
Abstract Factory design pattern is one of the Creational pattern. Abstract Factory pattern is almost similar to Factory Pattern is considered as another layer of abstraction over factory pattern. Abstract Factory patterns work around a super-factory which creates other factories.

Abstract factory pattern implementation provides us a framework that allows us to create objects that follow a general pattern. So at runtime, abstract factory is coupled with any desired concrete factory which can create objects of desired type.
___
### Code example 

In this example, image there is a furniture store, and it's catalog is updating frequently. 
In oder to not update code when a new furniture type or model has arrived to store, we used Abstract Factory Method.


#### Steps: 
1. In the Main class, call the ```AbstractFactory#getFactory()``` method which returns an instance of ```FurnitureFactory```.
2. AbstractFactory class decides which specific factory needs to be returned. In our case, according to the given parameter in the ```getFactory()``` method,
it returns either ```ModernFurniture``` or ```ClassicFurniture```.
3. So far, we just have the furniture model. In order to get furniture type which can be chair or table in our case, we call ```build()``` of the factories which is inheritic from the parent ```FurnitureFactory```.
4. According to the given type, factories can return the corresponding type of the furniture. 
5. To see what you can, call the ```getLabel()``` method of the furnitures which is inheritic by ```Furniture``` class.