### Factory Method

Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

### Arithmetic Expression Example

In this example,  we have a calculator that requires an arithmetic expression argument as a String to calculate the result of given expression.

#### Steps: 
1. In the Application.java, create an instance of Calculator.
2. Calls the method "calculate" which is inside Calculator.
3. Add an arithmetic expression to the method that you are calling. (e.g. 1 + 1)
4. The method retrieves the argument and parses operation and operands.
5. It calls the OperationFactory method to retrieve the correct operation according to parsed string.
6. As long as the operation is valid (+, -, *, /), executes the operation to find result.

In short, as you can see the code block below, it decides the which **Operation** instance should be initialized. This is called Factory Method pattern.
```java
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
```

For more information, please visit [this link](https://refactoring.guru/design-patterns/factory-method)