---
layout: pattern
title: Factory Method
folder: factory-method
permalink: /patterns/factory-method/
categories: Creational
tags: 
 - Java
 - Difficulty-Beginner
 - Gang Of Four
---

**Intent:** Define an interface for creating an object, but let subclasses
decide which class to instantiate. Factory Method lets a class defer
instantiation to subclasses.
**意图** 定义一个接口用于创建一个对象，并且是让子类去实例化。工厂方法让一个类延迟
实例化到子类。

![alt text](./etc/factory-method_1.png "Factory Method")

**Applicability:** Use the Factory Method pattern when

* a class can't anticipate the class of objects it must create
* a class wants its subclasses to specify the objects it creates
* classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate

**Credits**

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
