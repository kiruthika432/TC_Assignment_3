package TCAssignments_3;

import java.util.Scanner;

public class StudentScoreAndGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter student marks (0-100): ");
        int marks = input.nextInt();
        
        input.close();

        char grade;
        switch (marks / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            case 5:
            case 4:
                grade = 'E';
                break;
            default:
                grade = 'F';
                break;
        }

        System.out.println("Student Grade: " + grade);

	}

}
