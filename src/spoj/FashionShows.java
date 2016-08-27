package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.LongStream;

public class FashionShows {
	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine());
		int N;
		long sum[] = new long[testCases];
		int count = 0;
		int j;

		while (testCases > 0) {
			N = Integer.parseInt(reader.readLine());
			long array[] = new long[N];
			Arrays.fill(array, 1);
			j = 2;

			while (j > 0) {
				String[] integersInString = reader.readLine().split(" ");
				Arrays.sort(integersInString);
				for (int i = 0; i < integersInString.length; i++) {
					array[i] *= Long.parseLong(integersInString[i]);
				}
				j--;
			}
			sum[count++] = LongStream.of(array).sum();
			testCases--;
		}
		print(sum);
	}

	private static void print(long array[]) {
		for (long i : array) {
			System.out.println(i);
		}
	}
}
