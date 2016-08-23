package spoj;

import java.io.*;
import java.util.*;

public class GCD {

	public static void main(String args[]) {

		int gcd = 1;
		int numerator;
		int denominator;
		int count;
		String fraction;
		String numDen[];
		Scanner scanner = new Scanner(System.in);
		int totalTestCases = scanner.nextInt();
		scanner.nextLine();
		List<String> simplifiedList = new ArrayList<>();
		while(totalTestCases > 0){
			fraction = scanner.nextLine();
			numDen =  fraction.split("/");
			numerator = Integer.parseInt(numDen[0]);
			denominator = Integer.parseInt(numDen[1]);
			gcd = findGcd(numerator, denominator);
			numerator /= gcd;
			denominator /= gcd;
			simplifiedList.add(numerator + "/" + denominator);
			totalTestCases --;		
			
		}
		count = 1;
		for(String value: simplifiedList){
			System.out.println("Case " + count + ": " + value);
			count ++;
		}
		
	}
	
	private static int findGcd(int a, int b)
	{
	    if (b==0)
	        return a;
	    else
		return findGcd(b,a%b);
	}
}