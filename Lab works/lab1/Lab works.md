## Due Date : 12/16/2021 

# [](https://github.com/sumantiwari723/sumantiwari-java-2019-batch/blob/main/Lab/Lab%201/Lab%20Works.md#write-a-program-to-demonstrate-all-three-types-of-constructors-in-java)[](https://github.com/Pramodgrg/Java/blob/main/Lab/Lab%2001/Lab%20works.md#write-a-program-to-demonstrate-all-three-types-of-constructors-in-java)Write a program to demonstrate all three types of constructors in java

    class Constructors{

    

    	String msg;

    

    	public Constructors(){

    

    		System.out.println("Default Constructor");

    

    	}

    

    	public Constructors(String msg){

    

    		this.msg = msg;

    

    		System.out.println("Parameterized Constructor by:"+msg);

    

    	}

    

    	public Constructors(Constructors c){

    

    		System.out.println("This is Copy Constructor by: "+c.msg);

    

    	}

    

    	public static void main(String[] args){

    

    		Constructors defaultConstructor = new Constructors();

    

    		Constructors parameterizedConstructor = new Constructors("Prajwal");

    

    		Constructors copyConstructor = new Constructors(parameterizedConstructor);

    

    	}	

    

    }

    

# [](https://github.com/sumantiwari723/sumantiwari-java-2019-batch/blob/main/Lab/Lab%201/Lab%20Works.md#write-a-program-to-implement-stack-using-array)[](https://github.com/Pramodgrg/Java/blob/main/Lab/Lab%2001/Lab%20works.md#write-a-program-to-implement-stack-using-array)Write a program to implement stack using array

    import java.util.*;

    

    class Stacks{

    

    public static void main(String[] args){

    

    	int stack[] = new int[10];

    

    	int data, choice;

    

    	Scanner scan = new Scanner(System.in);

    

    	choice = scan.nextInt();

    

    	int top = 0;

    

    	try {

    

    		do{

    

    			System.out.println("\n 1.Push");

    

    			System.out.println("\n 2.Pop");

    

    			System.out.println("\n 3.View / Display");

    

    			System.out.println("\n 4.Exit");

    

    			System.out.println("\n Enter your choice:\t");

    

    			choice=scan.nextInt();

    

    			switch(choice){

    

    				case 1:

    

    					if (top<10){

    

    						System.out.println("\nEnter any element:\t");

    

    						data=scan.nextInt();

    

    						stack[top] = data;

    

    						top++;

    

    					}

    

    					else{

    

    						System.out.println(" Stack is full.");

    

    					}

    

    					break;

    

    					

    

    				case 2:

    

    					if (top>0){

    

    						top--;

    

    						System.out.println("\nElement poped is:\n"+stack[top]);

    

    					}

    

    					else{

    

    						System.out.println("\n Stack is Empty.");

    

    					}

    

    					break;

    

    				case 3:

    

    					if (top == 0){

    

    						System.out.println("\n Stack empty.");

    

    					}

    

    					else{

    

    						int i ;

    

    						for(i=top-1;i>=0;i--){

    

    							System.out.println(stack[i]+"\n");

    

    						}

    

    					}

    

    					break;

    

    				case 4:

    

    					System.exit(1);

    

    				default:

    

    					System.out.println("\n Select option from 1 to 4 only not others!!");			

    

    					

    

    			}

    

    		}while(choice != 4);

    

    		

    

    	} catch (Exception e) {

    

    		e.printStackTrace();

    

    	}

    

    	

    

    	

    

    }

    

    }

    

# [](https://github.com/sumantiwari723/sumantiwari-java-2019-batch/blob/main/Lab/Lab%201/Lab%20Works.md#write-a-program-to-implement-uses-of-abstract-class-)[](https://github.com/Pramodgrg/Java/blob/main/Lab/Lab%2001/Lab%20works.md#write-a-program-to-implement-uses-of-abstract-class-)Write a program to implement uses of Abstract Class .

    AbstractClass.java

    

    abstract class AbstractClass{

    

    	abstract void help();

    

    }

    

    

    

    AbsDemo.java

    

    class AbsDemo extends AbstractClass{

    

    	public void help(){

    

    	System.out.println("Abclass methode overide....");

    

    	}

    

    	public static void main(String[] args) {

    

    		AbstractClass abClass = new AbsDemo();

    

    		abClass.help();

    

    	}

    

    }

    

# [](https://github.com/sumantiwari723/sumantiwari-java-2019-batch/blob/main/Lab/Lab%201/Lab%20Works.md#write-a-program-to-achieve-multiple-inheritance-in-java)[](https://github.com/Pramodgrg/Java/blob/main/Lab/Lab%2001/Lab%20works.md#write-a-program-to-achieve-multiple-inheritance-in-java)Write a program to achieve multiple inheritance in java.

    package Inheritance;

    

    

    

    interface Child1 {

    

    

    

        default void show()

    

        {

    

            System.out.println("Hello from child 1");

    

        }

    

    }

    

     

    

    interface Child2 {

    

    

    

        default void show()

    

        {

    

            System.out.println("Hello form Child 2 ");

    

        }

    

    }

    

     

    

    class MultipleInheritance implements Child1, Child2 {

    

     

    

        public void show()

    

        {

    

            Child1.super.show();

    

            Child2.super.show();

    

        }

    

     

    

        public static void main(String args[])

    

        {

    

            MultipleInheritance childern = new MultipleInheritance();

    

            childern.show();

    

        }

    

    }

    

# [](https://github.com/sumantiwari723/sumantiwari-java-2019-batch/blob/main/Lab/Lab%201/Lab%20Works.md#write-a-program-to-find-sum-and-difference-of-two-numbers-using-command-line-arguments)[](https://github.com/Pramodgrg/Java/blob/main/Lab/Lab%2001/Lab%20works.md#write-a-program-to-find-sum-and-difference-of-two-numbers-using-command-line-arguments)Write a program to find sum and difference of two numbers using command line arguments

    class SumDiff{

    

    	public static void main(String[] args){

    

    	int a,b;

    

    	a = Integer.parseInt(args[0]);

    

    	b = Integer.parseInt(args[1]);

    

    	int sum = a+b;

    

    	int diff = a-b;

    

    	System.out.println("The sum is :"+sum);

    

    	System.out.println("The difference is :"+diff);

    

    	}

    

    }

    

# [](https://github.com/sumantiwari723/sumantiwari-java-2019-batch/blob/main/Lab/Lab%201/Lab%20Works.md#write-a-program-to-demonstrate-use-of-this-super-and-final)[](https://github.com/Pramodgrg/Java/blob/main/Lab/Lab%2001/Lab%20works.md#write-a-program-to-demonstrate-use-of-this-super-and-final)Write a program to demonstrate use of this, super and final

    class Super {

    

        int value = 20;

    

       }

    

       

    

       class Example extends Super {

    

        int value = 10;

    

        void display() {

    

         System.out.println(super.value);// prints super value 

    

        }

    

        void display2(int value){

    

         this.value = value;//changes to new value 

    

         System.out.println(this.value);// prints new value

    

        }

    

       

    

        public static void main(String args[]) {

    

         Example e = new Example();

    

         e.display();//this returns value from the super class that is parent class Super.

    

         e.display2(45);//new value is displayed

    

        }

    

       }

    

    

    

    final class Final{  //thid ensures that it cannot be extended to other class.

    

     public static void main(String[] args) {

    

         final double PI = 3.1415;//this value cannot be changed to another because this must be constant throughout the program.

    

         int radius = 7;

    

         double area = PI*radius*radius;

    

         System.out.println("The area of circle is:"+area);

    

     }

    

    }

    

# [](https://github.com/sumantiwari723/sumantiwari-java-2019-batch/blob/main/Lab/Lab%201/Lab%20Works.md#write-a-program-to-demonstrate-the-use-of-default-method-in-the-interface)[](https://github.com/Pramodgrg/Java/blob/main/Lab/Lab%2001/Lab%20works.md#write-a-program-to-demonstrate-the-use-of-default-method-in-the-interface)Write a program to demonstrate the use of default method in the interface.

    interface Example{

    

    

    

        default void display()

    

        {

    

            System.out.println("Hello from Default Method");

    

        }

    

    }

    

    

    

     

    

    class Interface implements Example{

    

     

    

        public static void main(String args[])

    

        {

    

            Interface i1 = new Interface();

    

            i1.display();

    

        }

    

    }

    

# [](https://github.com/sumantiwari723/sumantiwari-java-2019-batch/blob/main/Lab/Lab%201/Lab%20Works.md#write-a-program-to-demonstrate-the-use-of-static-methos-and-static-variable)[](https://github.com/Pramodgrg/Java/blob/main/Lab/Lab%2001/Lab%20works.md#write-a-program-to-demonstrate-the-use-of-static-methos-and-static-variable)Write a program to demonstrate the use of static methos and static variable

    class Static

    

    {

    

    	static int counter;

    

    	static int count;

    

    	public void increment()

    

    	{

    

    		counter++;

    

    	}

    

    	public static int getCounter()

    

    	{

    

    		count++;

    

    		return counter;

    

    	}

    

        public static void main(String[] args)

    

    	{

    

    		Static count1 = new Static();

    

    		Static count2 = new Static();

    

    		count1.increment();

    

    		System.out.println(Static.getCounter());//we can use the classname directly when the method and variables are static

    

    		count2.increment();

    

    		System.out.println(Static.getCounter());

    

    	}

    

    }
