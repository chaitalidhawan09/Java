package Operators;

public class LogicalOperators 
{

	public LogicalOperators() 
	{

	}

	public static void main(String[] args) 
	{
		  boolean a = true;
	      boolean b = false;
	      
	      
	      // Logical AND
	        System.out.println("a && b:: " + a +" && "+ b +" = "+ (a && b)); // false

	        // Logical OR
	        System.out.println("a || b:: " + a +" || "+ b +" = "+ (a || b)); // true

	        // Logical NOT
	        System.out.println("!a: " + (!a)); // false
	        System.out.println("!b: " + (!b)); // true

	        // Combining logical operators
	        boolean c = true;
	        boolean d = false;

	        // Using AND and OR together
	        System.out.println("(a && b) || (c && d): " + ((a && b) || (c && d))); // false

	        // Using NOT and OR together
	        System.out.println("!(a || b): " + !(a || b)); // false

		
	}

}
