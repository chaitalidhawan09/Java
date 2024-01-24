package Operators;

public class arithmeticOperators
{

	public arithmeticOperators()
	{
		
	}

	public static void main(String[] args)
	{
		int result = 5+3; // Arithmetic plus operator...+: Adds two values.
		
		System.out.println("Addition = "+result);
		
		int a = 10-6; // Arithmetic Subtraction  operator....-: Subtracts the right operand from the left operand
		
		System.out.println("Subtraction= "+a);
		
		int b = 5*6; // Arithmetic Multiplication operator......*: Multiplies two values.
		
		System.out.println("Multiplication=  "+b);
		
		int c = 10/4; // Arithmetic Division operator..../: Divides the left operand by the right operand.
		
		System.out.println("Division=  "+c);
		
		int d = 10%4; // Arithmetic Modulus operator....%: Returns the remainder when the left operand is divided by the right operand.
		
		System.out.println("Modulus=  "+d);
		
		int x =5; //Arithmetic post increament operator....++: Increases the value of a variable by 1.
		x++;
		System.out.println("post Increment= "+x);
		
		int y=5; //Arithmetic pree increament operator....++: Increases the value of a variable by 1
		++y;
		System.out.println("pre Increment=  "+y);
		
		
		int p =4; //Arithmetic post decreament operator....--: Decrease the value of a variable by 1.
		x--;
		System.out.println("post Decrement=  "+p);
		
		int q=3; //Arithmetic pree decreament operator....--: Increases the value of a variable by 1
		--q;
		System.out.println("pre Decrement= "+q);
		
		
		

	}

}
