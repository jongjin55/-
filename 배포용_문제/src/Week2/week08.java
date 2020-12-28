package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class week08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 n 입력 : ");
		int i = sc.nextInt();
		
		int[][] arr = new int[i][i];
		
		int k = 1;
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = 0; j2 < arr[j].length; j2++) {
				arr[j2][j] = k++;
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
		System.out.println(Arrays.toString(arr[j]));
		}
	}
}
