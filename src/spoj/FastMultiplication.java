package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FastMultiplication {
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		
		Map<Integer, BigInteger> myMap = new HashMap<Integer, BigInteger>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int count = 1;
		
		while (testCases > 0){
			
			String[] numbers = br.readLine().split(" ");
			BigInteger number1 = new BigInteger(numbers[0]);
			BigInteger number2 = new BigInteger(numbers[1]);
			myMap.put(count++, number1.multiply(number2));
			testCases --;	
		}
		
		for (BigInteger i : myMap.values()){
			System.out.println(i);
		}
	}
}
