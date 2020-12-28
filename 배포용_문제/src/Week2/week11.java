package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class week11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수  N입력 : ");
		int i = sc.nextInt();

		int[][] arr = new int[i][i];

		int p = 1;

		for (int j = 0; j < arr.length; j++) {

			if (j % 2 == 0) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					arr[j][j2] = p++;
				}
			} else {
				for (int j2 = arr.length-1; j2 >= 0; j2--) {
					arr[j][j2] = p++;
				}
			}
		}

	for (int j = 0; j < arr.length; j++) {
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[j][k] + "\t");
		}
		System.out.println();
	}

	}
}
