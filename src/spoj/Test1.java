package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int firstNumber = Integer.parseInt(reader.readLine());
		int secondNumber = Integer.parseInt(reader.readLine());
		System.out.println(firstNumber + secondNumber);
		reader.close();
	}
}
