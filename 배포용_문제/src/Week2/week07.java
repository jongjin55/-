package Week2;

import java.util.Scanner;

public class week07 {
	public static void main(String[] args) {

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);
		
		int temp = 0;

		for (int k = 0; k < arr.length; k++) {
			System.out.print((k+1) +"번째 입력 : ");
			int l = sc.nextInt();
			arr[k] = l;
		}
		
		for (int j = 1; j < arr.length; j++) {
			for (int i = 0; i < arr.length-j; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		
		System.out.println("정렬 후 ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
