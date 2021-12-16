Assigned Date: Dec 9 / 2021

Deadline : Dec 16 /2021

# 1.Constructors

>Constructor name must match the class name, and it cannot have a return type (like void).

>Constructor is called when the object is created.

All classes have constructors by default: \
If you do not create a class constructor yourself, Java creates one for you. \
Default Constructor Initializes:
* int -> 0
* float -> 0.0
* double -> 0.0
* char -> '\u0000' (the null character)
* String -> null

**Constructor Types**

- Default Constructor
- Parameterized Constructor
- Copy Constructor
```
Constructor Types
   ├── Default Constructor
   ├── Parameterized Constructor
   ├── Copy(Parameterized) Constructor
```

# 2.Stack using array
Stack is a linear data structure that follows a particular order in which the operations are performed. The order may be **LIFO(Last In First Out)** or **FILO(First In Last Out)**.
- Push: Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
- Pop: Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the stack is empty, then it is said to be an Underflow condition.
- Peek or Top: Returns the top element of the stack.
- isEmpty: Returns true if the stack is empty, else false

# 3.Uses of abstract class in java

Java Abstract class can implement interfaces without even providing the implementation of interface methods. Java Abstract class is used to provide common method implementation to all the subclasses or to provide default implementation. We can run abstract class in java like any other class if it has main() method.

# 4.Multiple inheritance in java
The only way to implement multiple inheritance is to implement multiple interfaces in a class. In java, one class can implements two or more interfaces. This also does not cause any ambiguity because all methods declared in interfaces are implemented in class.

>Java doesn’t support Multiple Inheritance. How ever it can be achieved using interface.
```Java
abstract class Bird{
	abstract void eat();
}

interface Fly{
	public void fly();
}

class Parrot extends Bird implements Fly{
	public void eat(){
	}
	public void fly(){
	}
}
```
> Class can implement multiple Runnable but not multiple classes.

# 5.Command-Line Arguments
A Java application can accept any number of arguments from the command line. This allows the user to specify configuration information when the application is launched.

The user enters command-line arguments when invoking the application and specifies them after the name of the class to be run.
```
Java CommandLineArgs 5 6
```
> passes 5,6 in args argument in:
```Java
class CommandLineArgs{
	public static void main(String[] args){
    }
}    
```
# 6.this,super,final

## &nbsp; Usage of superclass
- super variables refer to the object of the immediate parent class.
- super() invokes the constructor of immediate parent class.
- super refers to the method of the parent class.


## &nbsp; Final 
The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).

The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
Final Keyword can be used with:
- variable
- method
- class

# 7.Default Method(Interface)
The primary idea of including default method in interface is that don’t force the implementing classes to override it.
Generally, Methods we declare a method as default which has very less or negligible chances to be overridden by subclasses.
**Example**
```Java
interface Human {
   void speaks();
   void eats();
   default void walks(){
      System.out.println("Every human follows the same walking pattern");
   }
}
```
> Human's speak method should be overridden as human's can speak English,Nepali,etc. language. Human's eats method should be overridden as human's can Vegetarian,Non-Veg. But, every human have similar walking style

# 8.Static Method/Variable
The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.

The static can be:
- Variable (also known as a class variable)
- Method (also known as a class method)
- Block
- Nested class