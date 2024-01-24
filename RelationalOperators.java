package Operators;

public class RelationalOperators 
{

	public RelationalOperators() 
	{
		
	}

	public static void main(String[] args) 
	{
		int x=2;
		int y=6;
		
		//....== Equal to operator
		System.out.println("x == y :: "+x +" == "+ y+" = "+(x == y));//false
	
		
		//....!= not Equal to operator
		System.out.println("x != y :: "+x +" != "+ y+" = "+(x != y));//True
		
		
		//... < less than to operator
		System.out.println("x < y :: "+ x +" < "+ y +" = "+(x < y));//True

		
		//... > greater than to operator
		System.out.println("x > y :: "+ x +" > "+ y +" = "+(x > y));//false
				
		

		//... <= less than or equal to operator
		System.out.println("x <= y :: "+ x +" <= "+ y +" = "+(x <= y));//True

		
		//... >= greater than or equal to operator
		System.out.println("x >= y :: "+ x +" >= "+ y +" = "+(x >= y));//false
	}

}
