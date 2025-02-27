package TCAssignments_3;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2; 

        loop: while (num <= 30) {
            int div = 2;
            
            while (div < num) {
                if (num % div == 0) {
                    num++;  
                    continue loop;  
                }
                div++;
            }

            System.out.print(num + " ");

            num++; 
        }

	}

}
