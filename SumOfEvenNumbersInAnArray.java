package TCAssignments_3;

import java.util.Scanner;

public class SumOfEvenNumbersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int n = input.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("array[" + i + "]" + "=");
			array[i] = input.nextInt();
		}
			
			input.close();
			
			int sum = 0;

	        for (int i = 0; i < n; i++) {
	            if (array[i] % 2 != 0) {
	                continue; 
	            }
	            sum += array[i];
	        }

	        System.out.println("Sum of even numbers: " + sum);
		}

	}


