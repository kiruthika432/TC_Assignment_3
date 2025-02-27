package TCAssignments_3;

import java.util.Scanner;

public class SecondOcurrenceInAnGivenArray{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        
        System.out.print("Enter the number to find the second occurrence: ");
        int target = input.nextInt();
        
        input.close(); 
        
        int count = 0, index = -1;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
                if (count == 2) {
                    index = i;
                    break;
                }
            }
        }

        if (index != -1) {
            System.out.println("Second occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println("The number " + target + " does not have a second occurrence in the array.");
        }
    }
}
