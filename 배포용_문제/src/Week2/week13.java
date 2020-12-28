package Week2;

import java.util.Arrays;

public class week13 {
	public static void main(String[] args) {

		char[][] arr = new char[5][5];

		int p = 65;
		int k = 0;
		
		for (int i = 0; i < arr.length; i++) {

			if (i < arr.length / 2) {
				k = i;
			} else {
				k = arr.length - 1 - i;
			}

			for (int j = k; j < arr[i].length - k; j++) {
				arr[i][j] = (char) p++;

			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}
}
