import java.util.*;

public class SortArray {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask how many elements you want in the array
        System.out.print("How many number you want to put into the array? ");
        int num = input.nextInt();
        int numbers[] = new int[num];

        // Loop to add numbers to the array
        for (int i = 1; i <= num; i++) {
            System.out.print("Number "+i+": ");
            numbers[i-1] = input.nextInt();
        }

        System.out.print("Array before being sorted: ");

        // Prints the unsorted array
        System.out.println(Arrays.toString(numbers));
        

        // The most basic way to sort an array
        Arrays.sort(numbers);
        
        System.out.print("Array after being sorted: ");

        // Prints the sorted array
        System.out.print(Arrays.toString(numbers));

        input.close();
    }
}
