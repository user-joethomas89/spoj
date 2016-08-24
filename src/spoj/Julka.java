package spoj;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Julka {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Map<Integer, BigInteger> myMap = new HashMap<Integer, BigInteger>();
		int number = 10;
		int mapControl = 1;
		BigInteger total; 
		BigInteger difference; 		
		BigInteger natalia = new BigInteger("0");
		BigInteger klaudia = new BigInteger("0");
		
		while(number > 0){
			String s = scanner.nextLine();
			String s1 = scanner.nextLine();
			total = new BigInteger(s);
			difference = new BigInteger(s1);
			natalia = (total.subtract(difference)).divide(new BigInteger("2"));
			klaudia = natalia.add(difference);
			myMap.put(mapControl ++, klaudia);
			myMap.put(mapControl ++, natalia);
			number --;			
		}
		scanner.close();
		print(myMap);
	}
	
	private static void print(Map<Integer, BigInteger> map){
		for(BigInteger i: map.values()){
			System.out.println(i);
		}
	}
}
