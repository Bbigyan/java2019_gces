**Assigned Date: 2021/12/31** &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
**Deu Date:2022/01/07**

# Lab 2
## Java Package
Packages in Java are a mechanism to encapsulate a group of classes, interfaces, and sub-packages. In Java, it is used for making search/locating and usage of classes, interface, enumerations, and annotations easier.

#### Types of Package
* Built-in packages
* User-defined packages

## Exception Handling
An **exception** is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time, that disrupts the normal flow of the program’s instructions.

The **Exception Handling** in Java is one of the powerful mechanism to handle the errors so that the normal flow of the application can be maintained.
#### Java Exception Keywords
* try
* catch
* throws
* throw
* finally

##### try:
The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.

##### catch:
The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

##### throws:
The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.
##### throw:
The "throw" keyword is used to throw an exception.
##### finally:
The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.

## Chained Exception
Chained Exceptions allows to relate one exception with another exception, i.e one exception describes cause of another exception. For example, consider a situation in which a method throws an ArithmeticException because of an attempt to divide by zero but the actual cause of exception was an I/O error which caused the divisor to be zero. The method will throw only ArithmeticException to the caller. So the caller would not come to know about the actual cause of exception. Chained Exception is used in such type of situations.

## File Handling
File handling is an important part of any application.
Java has several methods for creating, reading, updating, and deleting files.
File Handling in JAVA is achieved through `java.io` package.
#### General Java File Handling Classes
* File
* FileReader
* FileWriter
* BufferedReader
* BufferedWriter
* PrintReader
* PrintWriter
