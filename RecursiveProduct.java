import java.util.Scanner;

public class RecursiveProduct {

	// Multiplies the current number by the product of the remaining numbers.
	public static double calculateProduct(double[] numbers, int index) {
		// Stops recursion after all numbers have been processed.
		
		if (index == numbers.length) {
			return 1.0;
		}
		return numbers[index] * calculateProduct(numbers, index + 1);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[5];

		// Gets five numbers from the user.
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			numbers[i] = input.nextDouble();
		}

		// Calculates and displays the product.
		double product = calculateProduct(numbers, 0);
		System.out.println("Product: " + product);

		input.close();
	}
}