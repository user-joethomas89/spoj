package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wow {

	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(reader.readLine());
		String wow = "o";
		number --;
		while (number > 0){
			wow += "o";
			number --;
		}
		System.out.println("W"+wow+"w");
	}
}
