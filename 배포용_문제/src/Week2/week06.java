package Week2;

import java.util.Scanner;

public class week06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {

			System.out.print((i + 1) + "번째 수 입력 : ");
			int j = sc.nextInt();
			arr[i] = j;
		}
		

		for (int j = 0; j < arr.length-1; j++) {
			int min = arr[j];
			int minIndex = j;
			
			for (int i = j+1; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
					minIndex = i;
				}
			}
			int temp = arr[j];
			arr[j] = min;
			arr[minIndex] = temp;
		}

		System.out.println("정렬 후");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

	}
}
