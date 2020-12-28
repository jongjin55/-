package Week2;

import java.util.Arrays;

public class week12 {
	public static void main(String[] args) {

		int[][] arr = { {1, 2, 3, 4, 5}, 
				{6, 7 ,8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));	
		}
		System.out.println();
		
		for (int i = arr.length-1; i >= 0; i--) {
			for (int j = 0; j<arr.length; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		
	}
}
