package TCAssignments_2;

import java.util.Scanner;

public class BitwiseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the operand1 for bitwise operator: " );
		int a = input.nextInt();
		
		System.out.println("Enter the operand2 for bitwise operator: " );
		int b = input.nextInt();
		
		System.out.println("Enter the negative value for Bitwise Operator: ");
		int c = input.nextInt();
		
		System.out.println("The value for Bitwise OR(a|b) of two operands is: " + (a|b));
		System.out.println("The value for Bitwise AND(a&b) of two operads is: " + (a&b));
		System.out.println("The value for Bitwise XOR(a^b) of two operands is: " + (a^b));
		System.out.println("The value for Bitwise Complement(~a) of a is: " + ~a);
		System.out.println("The value for Bitwise Complement(~b) of b is: " + ~b);
		System.out.println("The value for Bitwise rightShift(a>>2) of a is: " + (a>>2));
		System.out.println("The value for Bitwise UnsignedRightShift ( c >>> 2) of c is: " + (c>>>2));
		System.out.println("The value for Bitwise LeftShift ( b << 2) of b is: " + (b<<2));
		
	    input.close();	

	}

}
