package TCAssignments_3;

import java.util.Scanner;

public class FindGreatestOf_3_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value for a: ");
		int a = input.nextInt();
		
		System.out.println("Enter the value for b: ");
		int b = input.nextInt();
		
		System.out.println("Enter the value for c: ");
		int c = input.nextInt();
		
		input.close();
		
		if( a > b && a > c) {
			System.out.println("The Greatest of three numsbers is: " + a);
		}
		else if( b > a && b > c) {
			System.out.println("The Greatest of three numbers is: " + b);
		}
		else {
			System.out.println("The Greatest of three numbers is: " + c);
		}
	}

}
