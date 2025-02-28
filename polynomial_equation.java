package TCAssignments_2;

import java.util.Scanner;

public class polynomial_equation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.println("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.println("Enter the value for c: ");
        double c = input.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be zero).");
        } 
        else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The roots are real and different:");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } 
            else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The roots are real and the same:");
                System.out.println("Root: " + root);
            } 
            else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("The roots are complex and different:");
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }
        }

        input.close();
    }
}