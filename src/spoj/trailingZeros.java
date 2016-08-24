package spoj;

import java.util.ArrayList;
import java.util.Scanner;

public class trailingZeros {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		int number = scanner.nextInt();
		
		while (number > 0) {
			int i = scanner.nextInt();
			int j = trailing(i);
			array.add(j);
			number--;
		}
		
		for (Integer i : array) {
			System.out.println(i);
		}
		scanner.close();
	}

	private static int trailing(int n) {
		if (n < 0) {
			return -1;
		}
		int count = 0;
		for (long i = 5; n / i >= 1; i *= 5) {
			count += n / i;
		}

		return count;
	}

}
