package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HalfOfTheHalf {
	public static void main(String args[]) throws IOException {
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		String s;
		int length;
		int i;
		String modified;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine());
		int count = 1;
		while (testCases > 0) {
			i = 0;
			s = reader.readLine();
			length = s.length() / 2;
			modified = "";
			while (i < length) {
				modified += s.charAt(i);
				i += 2;
			}
			myMap.put(count++, modified);
			testCases--;
		}
		print(myMap);
	}

	private static void print(Map<Integer, String> map) {
		for (String i : map.values()) {
			System.out.println(i);
		}
	}

}