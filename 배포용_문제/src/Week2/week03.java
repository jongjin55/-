package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class week03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("N �Է� >> ");
		int i = sc.nextInt();

		int[] arr = new int[i];

		System.out.print("X �Է� >> ");
		int j = sc.nextInt();

		for (int j2 = 0; j2 < arr.length; j2++) {
			System.out.print(j2 + 1 + "��° ���� �Է� >> ");
			int k = sc.nextInt();
				if (k < j) {
					arr[j2] = k;
			}

		}
		for (int j2 = 0; j2 < arr.length; j2++) {
			if(arr[j2] > 0)
				System.out.print("��� : " + arr[j2] + " ");
		}
	}
}