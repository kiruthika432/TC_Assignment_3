package TCAssignments_2;

public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int outside_variable = 10;
		
		if(outside_variable > 5) {
			
			int inside_variable = 20;
			
			System.out.println("Inside if block: ");
			System.out.println("OutsideVariable: " + outside_variable);
			System.out.println("InsideVariable: " + inside_variable);
		}
		
		System.out.println("Outside if block: ");
		System.out.println("OutsideVariable: " + outside_variable);
		//System.out.println("InsideVariable: " + inside_variable);               // at this line it gives error
	}

}
