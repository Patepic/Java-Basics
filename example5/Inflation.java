import java.util.*;

public class Inflation {
    
    public static void main (String[]args) {
 
		Scanner input = new Scanner (System.in);
 
		System.out.print("Enter the price of the item: ");
		double price = input.nextDouble();
 
		System.out.print("The number of years for inflation: ");
		double years = input.nextDouble();
 
		System.out.print("Enter the rate of inflation as percentage: ");
		Double rate = input.nextDouble();
 
        input.close();
        
		rate = rate/100;
 
		for (int i = 1; i<=years; i++) {
			price = price+(price * rate);
		}
			System.out.printf("After %.2f years, the price will be $%.2f",years,price);
 
 
		}
}
