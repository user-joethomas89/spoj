package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DieHard {

	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine());
		int array[][] = new int[testCases][2];
		int count = 0;

		while (count < testCases) {
			String[] integersInString = reader.readLine().split(" ");
			array[count][0] = Integer.parseInt(integersInString[0]);
			array[count][1] = Integer.parseInt(integersInString[1]);
			count++;
		}

		count = 0;
		while (count < testCases) {
			Player player = new Player(array[count][0], array[count][1]);
			while (player.health > 0 && player.armour > 0) {
				player.clock();
				player.air();
				if (player.armour > 10) {
					player.water();
					player.clock();
				} else if (player.health > 20) {
					player.fire();
					player.clock();
				} else {
					break;
				}
			}
			System.out.println(player.time);
			count++;
		}
	}

	private static class Player {

		private int health;
		private int armour;
		private int time;

		Player(int health, int armour) {
			this.health = health;
			this.armour = armour;
			this.time = 0;
		}

		private void air() {
			health += 3;
			armour += 2;
		}

		private void fire() {
			health -= 20;
			armour += 5;
		}

		private void water() {
			health -= 5;
			armour -= 10;
		}

		private void clock() {
			if (health > 0 && armour > 0) {
				time++;
			}
		}
	}
}
