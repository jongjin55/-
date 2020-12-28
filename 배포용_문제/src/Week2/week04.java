package Week2;

import java.util.Arrays;

public class week04 {
	public static void main(String[] args) {

		int[] point = { 93, 32, 52, 9, 81, 2, 68 };

		int total = 0;
		int min = point[0];
		int x = 0 , y = 0;

		for (int i = 0; i < point.length - 1; i++) {
			for (int j = i + 1; j < point.length; j++) {

				total = point[i] - point[j];

				if (total < 0) {
					total *= -1;
				}

				if (min > total) {
					min = total;
					x = i;
					y = j;
				}
			}
		}

		System.out.println("resutlt : [ " + x + " , " + y + " ]");
	}
}
