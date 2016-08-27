package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextPalindrome {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int[] palindrome = new int[testCases];
		int count = 0;
		while (testCases > 0){
			int n = Integer.parseInt(br.readLine());
			palindrome[count ++] = getNextHigherPalindrome(n);
			testCases --;
		}
		for (int i:palindrome){
			System.out.println(i);
		}
	}
 
	private static int getNextHigherPalindrome(int number) {
 
		//Base cases
		if(number <= 10)
			return 11;
 
		int[] numArr = convertIntToArrayOfDigits(number);
		if(areAllDigits9(numArr))
			return number+2;
 
		boolean isEvenDigits = numArr.length%2 == 0;
 
		int iter_i, iter_j;
		int middleElement = (numArr.length/2);
 
		int leftStart = isEvenDigits ? middleElement - 2 : middleElement - 1;
		int rightStart = middleElement + 1;
		boolean middleNeedsIncrement = false;
		for(iter_i=leftStart, iter_j=rightStart; iter_i>=0 ; iter_i--, iter_j++) {
			if(numArr[iter_i] < numArr[iter_j]) { //if any left side number is lesser than the right
				middleNeedsIncrement = true;
				break;
			}
		}
		if(iter_i == -1) //if the input number is already a palindrome
			middleNeedsIncrement = true;
 
		//change the middle element
		if(middleNeedsIncrement) {
			int carry = 0;
			for(iter_i=middleElement ; iter_i>=0; iter_i--) {
				if(numArr[iter_i] != 9) {  
					if(isEvenDigits && iter_i==middleElement) {
						//Update both middle elements
						numArr[iter_i] = numArr[iter_i-1] = Math.min(numArr[iter_i], numArr[iter_i-1]) + 1;
					}
					else {
						numArr[iter_i]++;
					}
 
					carry = 0; //No more 9s remain to convert to 0;
				}
				else { //if input contains 9 in the middle
					numArr[iter_i] = 0;
					carry = 1;
				}
 
				if(carry==0)
					break;
			}
		}
 
		//copy left part to right part
		for(iter_i=leftStart, iter_j=rightStart; iter_i>=0 ; iter_i--, iter_j++) {
			numArr[iter_j] = numArr[iter_i];
		}
 
		return convertArrayOfDigitsToNumber(numArr);
	}
 
	private static boolean areAllDigits9(int[] numArr) {
		for(int i=0; i<numArr.length; i++)
			if(numArr[i] != 9)
				return false;
 
		return true;
	}
 
	private static int convertArrayOfDigitsToNumber(int[] numArr) {
		int num = 0;
		int multiplier = (int) Math.pow(10, numArr.length - 1);
		for(int i=0 ; i<numArr.length; i++) {
			num += numArr[i] * multiplier;
			multiplier /= 10;
		}
 
		return num;
	}
 
	private static int[] convertIntToArrayOfDigits(Integer number) {
		String temp = number.toString();
		int[] numArr = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    numArr[i] = temp.charAt(i) - '0';
		}
 
		return numArr;
	}
}