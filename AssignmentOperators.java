package Operators;

public class AssignmentOperators 
{

	public AssignmentOperators() 
	{

	}

	public static void main(String[] args) 
	{
		 int x = 5;
	        System.out.println("x = " + x); // 5

	        // Addition assignment
	        x += 3; // Equivalent to x = x + 3;
	        System.out.println("x += 3: " + x); // 8

	        // Subtraction assignment
	        x -= 2; // Equivalent to x = x - 2;
	        System.out.println("x -= 2: " + x); // 6

	        // Multiplication assignment
	        x *= 4; // Equivalent to x = x * 4;
	        System.out.println("x *= 4: " + x); // 24

	        // Division assignment
	        x /= 3; // Equivalent to x = x / 3;
	        System.out.println("x /= 3: " + x); // 8

	        // Modulus assignment
	        x %= 5; // Equivalent to x = x % 5;
	        System.out.println("x %= 5: " + x); // 3

	        // Concatenation assignment (String concatenation)
	        String str = "Hello";
	        str += " World"; // Equivalent to str = str + " World";
	        System.out.println("str += \" World\": " + str); // Hello World
	  

		
	}

}
