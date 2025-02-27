package TCAssignments_3;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value for multiplication table: ");
		int num = input.nextInt();
		
		input.close();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println( i + " x " + num + " = " + i*num);
		}

	}

}
