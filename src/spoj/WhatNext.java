package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WhatNext {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		int first ;
		int second ;
		int third ;
		int count = 1;
		String line;
		String[] splitLine;
		while (true) {
			line = reader.readLine();
			splitLine = line.split(" ");
			first = Integer.parseInt(splitLine[0]);
			second = Integer.parseInt(splitLine[1]);
		    third = Integer.parseInt(splitLine[2]);    
		    if (first == second && first == third){
				break;
			} else if (second - first == third - second) {
				myMap.put(count ++, "AP"+ " " + (third + (third - second)));
			} else if (first != 0 && second != 0 && second / first == third / second){
				myMap.put(count ++, "GP"+ " " + (third * (third / second)));
			} 
		}
		print(myMap);
	}
	private static void print(Map<Integer, String> map) {
		for (String i : map.values()) {
			System.out.println(i);		
			}
	}

}
