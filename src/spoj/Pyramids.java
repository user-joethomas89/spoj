package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramids {

	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine());
		Double[] volumeArray = new Double[testCases];
		int count = 0;
		
		while (testCases > 0){
			
			String[] values = reader.readLine().split(" ");
			double u = Double.parseDouble(values[0]);
			double v = Double.parseDouble(values[0]);
			double w = Double.parseDouble(values[0]);
			double W = Double.parseDouble(values[0]);
			double V = Double.parseDouble(values[0]);
			double U = Double.parseDouble(values[0]);
			
			double uu = Math.pow(v, 2) + Math.pow(w, 2) - Math.pow(U, 2);
			double vv = Math.pow(w, 2) + Math.pow(u, 2) - Math.pow(V, 2);
			double ww = Math.pow(u, 2) + Math.pow(v, 2) - Math.pow(W, 2);
			
			double part1 = 4 * Math.pow(u, 2) * Math.pow(v, 2) * Math.pow(w, 2);
			double part2 = Math.pow(u, 2) * Math.pow(uu, 2);
			double part3 = Math.pow(v, 2) * Math.pow(vv, 2);
			double part4 = Math.pow(w, 2) * Math.pow(ww, 2);
			double part5 = uu * vv * ww;
			
						
			double volume = (Math.sqrt(part1 - part2 - part3 - part4 + part5)) / 12;
			
			volumeArray[count++] = (double) Math.round(volume * 10000) / 10000;
			testCases --;
		}
		
		for (Double d : volumeArray){
			System.out.println(d);
		}
		
	}
}
