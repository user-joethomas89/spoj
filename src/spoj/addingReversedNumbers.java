package spoj;

import java.util.ArrayList;
import java.util.Scanner;

public class addingReversedNumbers {

	public static void main(String args[]) {
		int firstNumber;
		int secondNumber;
		int result;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		int number = scanner.nextInt();
		
		while (number > 0) {
			firstNumber = scanner.nextInt();
			secondNumber = scanner.nextInt();
			firstNumber = reverse(firstNumber);
			secondNumber = reverse(secondNumber);
			result = firstNumber + secondNumber;
			result = reverse(result);
			array.add(result);
			number--;
		}
		scanner.close();
		print(array);
	}

	private static int reverse(int number) {
		int digit;
		int reverse = 0;

		while (number != 0) {
			digit = number % 10;
			reverse = (reverse * 10) + digit;
			number /= 10;
		}
		return reverse;
	}

	private static void print(ArrayList<Integer> array) {
		for (int loopControl : array) {
			System.out.println(loopControl);
		}
	}
}
