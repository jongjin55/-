package Week2;

import java.util.Arrays;

public class week10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[7][7];
		
		int k = arr.length/2;
		int p = 1;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = k; j < arr[i].length-k; j++) {
				arr[i][j] = p++;
			}
			
			if(i < arr.length/2) {
				k = k-1;
			}else {
				k = k+1;
			}
		}
		
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + "\t");	
		}
		System.out.println();
	}
		
	}
}
