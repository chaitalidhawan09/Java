package Operators;

class Animal{}


class Dog extends Animal{}


public class InstanceOfOperator 
{

	public InstanceOfOperator()
	{

	
	}

	public static void main(String[] args)
	{
		 Animal animal = new Dog();

	        // Using instanceof to check if the object is an instance of a particular class
	        if (animal instanceof Dog) 
	        {
	            System.out.println("The object is a Dog");
	        } 
	        else 
	        {
	            System.out.println("The object is not a Dog");
	        }

	        // Checking with a different type
	        if (animal instanceof Animal)
	        {
	            System.out.println("The object is an Animal");
	        } 
	        else
	        {
	            System.out.println("The object is not an Animal");
	        }
	        
	  
	}

}
