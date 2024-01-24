package Operators;

public class ConditionalTernaryOperator 
{

	public ConditionalTernaryOperator() 
	{

	
	}

	public static void main(String[] args)
	{

		//syntax
		//condition ? expression_if_true : expression_if_false;
	
		
			
		int x = 10;
	        int y = 20;

	        // Using the conditional operator to find the maximum of two numbers
	        int max = (x > y) ? x : y;

	        System.out.println("The maximum of " + x + " and " + y + " is: " + max);
	}

}
