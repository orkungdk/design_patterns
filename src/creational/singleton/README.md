### Singleton

Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
___
### Code example 

In this example, a hibernate simulation. To make a class singleton,

1. Class cannot be initialized in the any other class except itself. So constructor method should be **private**.
2. There should be a **private static** self instance to keep the created object in the heap memory. Otherwise, object will be removed once the execution of the code block is finished.
    ```java
    private static Repository instance = new Repository();
    ```  
3. Create a **public static** method that returns an instance of itself.
    ```java
    public static Repository getInstance() {
        return instance;
    }    
   ```  
4. It is ready. You can call your singleton class intance with ```SingletonClass.getInstance()```
___
For more information, please visit [this link](https://refactoring.guru/design-patterns/singleton)!!!
___