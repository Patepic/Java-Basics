import java.util.*;

public class SumAndAverage {
	public static void main(String[] args) {
	
		int sum = 0;
		int count = 0;

		Scanner input = new Scanner(System.in);
		
        // Loop to add 5 numbers
        while (count < 5) {
        System.out.print("Enter a whole number: ");
		int number = input.nextInt();

            sum += number;
            count++;
        
        }
        
        input.close();

        // Gets the average of 5 numbers
        double average = sum/5; 
        
        System.out.println("The sum of the 5 numbers is "+sum);
		System.out.println("The average of the 5 numbers is "+average);
	}
}