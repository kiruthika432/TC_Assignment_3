package TCAssignments_2;

import java.util.Scanner;

public class Celsius_to_Fahrenheat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value for Celcius: ");
		int f = input.nextInt();
		
		input.close();
		
		float Fahrenheat = (float)(f*9/2)+32;
		
		System.out.println("The Converted value of Celsius to Fahrenheat is: " + Fahrenheat +"°F");    
	}

}
