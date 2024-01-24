package Operators;

public class TypeCastOperator
{

	public TypeCastOperator()
	{

	
	}

	public static void main(String[] args) 
	{

		 // Implicit casting (widening conversion)
        int intValue = 10;
        double doubleValue = intValue; // int to double (automatically converted)

        System.out.println("intValue: " + intValue);
        System.out.println("doubleValue: " + doubleValue);

        // Explicit casting (narrowing conversion)
        double anotherDoubleValue = 15.75;
        int anotherIntValue = (int) anotherDoubleValue; // double to int (explicitly cast)

        System.out.println("anotherDoubleValue: " + anotherDoubleValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        // Example with different data types
        long longValue = 1234567890123456789L;
        int truncatedIntValue = (int) longValue; // long to int (explicitly cast, may lose precision)

        System.out.println("longValue: " + longValue);
        System.out.println("truncatedIntValue: " + truncatedIntValue);

		
	}

}
