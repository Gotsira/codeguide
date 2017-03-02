# codeguide
##Avoid Creating a YAGNI (You aren’t going to need it)

When you write a code, you would try to keep your code simple without any extra things. Having an attribute or a method which you don't
require sometimes confuses the reader. They would think like why is that attribute or method in the code when it is not being used. In 
programming, you need to avoid confusion for the reader and so if we find any extra stuffs in the code, it needs to be remove. This
principle will reduce confusion for the reader.

```java
int a = 1;
int b = 2;
int name = "Got";
System.out.println(a+b);
```

In this case, name is not being used so you need to remove it or the readers might wonder what name is being used for.

Reference: http://www.artima.com/weblogs/viewpost.jsp?thread=331531

##LSP (Liskov Substitution Principle)

According to the Liskov Substitution Principle, functions that use references to base classes must be able to use objects of the derived
class without knowing it. Suppose a class Square extends class Shape, the subclass Circle should be able to perform all the fuctions class
Shape can perform.

```java
Shape shape = new Shape(2,2);
Shape square = new Square(2,2);
System.out.println(a.getArea() == b.getArea()); //true
```

Reference: https://dzone.com/articles/the-liskov-substitution-principle-with-examples
