package spoj;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<BigInteger> array = new ArrayList<>();
		int number = scanner.nextInt();

		while (number > 0) {
			int i = scanner.nextInt();
			array.add(fact(i));
			number--;
		}

		for (BigInteger i : array) {
			System.out.println(i);
		}
		scanner.close();
	}

	private static BigInteger fact(int i) {
		BigInteger fact = new BigInteger("1");

		if (i == 0) {
			return fact;
		}

		Integer integer = new Integer(i);
		BigInteger big = BigInteger.valueOf(integer.intValue());

		while (integer > 0) {
			fact = fact.multiply(big);
			integer--;
			big = BigInteger.valueOf(integer.intValue());
		}
		return fact;
	}
}
