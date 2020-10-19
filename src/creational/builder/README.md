### Builder
Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.
___
### Code example 

In this example, we have a burger shop, and we are going to prepare menus.

1. There are ```Burger```, ```Beverage```, ```Appetizer```, ```Dessert``` items.
2. A menu contains a list of those items. 
3. We implemented all items according to corresponding hierarchy.
4. ```MenuBuilder``` has two prepare method which are creates necessary items and adds to the menu instance that to be returned. 
---
For more information, please visit [this link](https://refactoring.guru/design-patterns/builder)!!!
---