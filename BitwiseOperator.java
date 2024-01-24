package Operators;

public class BitwiseOperator 
{

	public BitwiseOperator() 
	{

	
	}

	public static void main(String[] args) 
	{

		 int a = 5;   // binary: 0101
	        int b = 3;   // binary: 0011

	        // Bitwise AND (&)
	        int resultAnd = a & b;  // binary: 0001
	        System.out.println("a & b: " + resultAnd); // 1

	        // Bitwise OR (|)
	        int resultOr = a | b;   // binary: 0111
	        System.out.println("a | b: " + resultOr); // 7

	        // Bitwise XOR (^)
	        int resultXor = a ^ b;  // binary: 0110
	        System.out.println("a ^ b: " + resultXor); // 6

	        // Bitwise NOT (~)
	        int resultNotA = ~a;  // binary: 11111111111111111111111111111010 (32-bit representation)
	        System.out.println("~a: " + resultNotA); // -6

	        // Left shift (<<)
	        int resultLeftShift = a << 1;  // binary: 1010
	        System.out.println("a << 1: " + resultLeftShift); // 10

	        // Right shift (>>)
	        int resultRightShift = a >> 1;  // binary: 0010
	        System.out.println("a >> 1: " + resultRightShift); // 2

	        // Zero-fill right shift (>>>)
	        int negativeNumber = -5;
	        int resultZeroFillRightShift = negativeNumber >>> 1;
	        // binary representation depends on the size of the integer (e.g., 11111111111111111111111111111101 for 32-bit)
	        System.out.println("negativeNumber >>> 1: " + resultZeroFillRightShift);

		
	}

}
